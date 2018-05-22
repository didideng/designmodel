package mediator;

/**
 * @author luoyushan
 * @Date 2018/5/22
 */
public class UnitedNationsSecurityCouncil extends UnitedNations {
    private Country colleague1;
    private Country colleague2;

    public void setColleague1(Country usa){
        colleague1 = usa;
    }
    public void setColleague2(Country iraq){
        colleague2 = iraq;
    }
    @Override
    public void declare(String message, Country colleague) {
        if (colleague == colleague1){
            colleague2.getMessage(message);
        }else{
            colleague1.getMessage(message);
        }
    }
}
