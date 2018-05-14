package duty;

/**
 * 经理
 * @author luoyushan
 * @Date 2018/5/14
 */
public class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假") && Integer.valueOf(request.getRequestContent()) <=2 ){
            System.out.println("请假"+request.getRequestContent()+"天被批准");
        }else{
            if (superior != null){
                superior.requestApplications(request);
            }
        }
    }
}
