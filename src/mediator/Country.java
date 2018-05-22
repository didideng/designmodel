package mediator;

/**
 * 国家
 * @author luoyushan
 * @Date 2018/5/22
 */
public abstract class Country {
    protected UnitedNations mediator;

    public Country(UnitedNations mediator){
        this.mediator = mediator;
    }
    public void declare(String message){
        mediator.declare(message, this);
    }
    public void getMessage(String message){
        System.out.println(message);
    }
}
