package duty;

/**
 * 总经理
 * @author luoyushan
 * @Date 2018/5/14
 */
public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假")){
            System.out.println("请假"+request.getRequestContent()+"天被批准");
        }else{
            System.out.println("其他别找我");
        }
    }
}
