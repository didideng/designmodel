package mediator;

/**
 * @author luoyushan
 * @Date 2018/5/22
 */
public class Iraq extends Country {

    public Iraq(UnitedNations mediator) {
        super(mediator);
    }
    //声明
    public void declare(String message){
        mediator.declare(message,this);
    }
    //获取消息
    public void getMessage(String message){
        System.out.println("Iraq获取消息："+message);
    }
}
