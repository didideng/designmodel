package mediator;

/**
 * @author luoyushan
 * @Date 2018/5/22
 */
public class USA extends Country {

    public USA(UnitedNations mediator) {
        super(mediator);
    }
    //声明
    public void declare(String message){
        mediator.declare(message, this);
    }
    //获得消息
    public void getMessage(String message){
        System.out.println("USA获取消息："+message);
    }
}
