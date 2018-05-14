package duty;

/**
 * @author luoyushan
 * @Date 2018/5/14
 */
public abstract class Manager {
    protected String name;
    //管理者上级
    protected  Manager superior;

    public Manager(String name){
        this.name = name;
    }
    public void setSuperior(Manager superior){
        this.superior = superior;
    }

    //请求
    abstract public void requestApplications(Request request);
}
