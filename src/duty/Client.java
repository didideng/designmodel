package duty;

/**
 * @author luoyushan
 * @Date 2018/5/14
 */
public class Client {
    public static void main(String[] args) {
        CommonManager jinli = new CommonManager("经理");
        Majordomo zongjian = new Majordomo("总监");
        GeneralManager zongjingli = new GeneralManager("总经理");
        //设置责任链,根据需求进行变更
        jinli.setSuperior(zongjian);
        zongjian.setSuperior(zongjingli);

        Request req = new Request();
        req.setRequestType("请假");
        req.setRequestContent("4");
        jinli.requestApplications(req);
    }
}
