package mediator;

/**
 * @author luoyushan
 * @Date 2018/5/22
 */
public class Client {
    public static void main(String[] args) {
        UnitedNationsSecurityCouncil unsc = new UnitedNationsSecurityCouncil();

        Country usa = new USA(unsc);
        Country iraq = new Iraq(unsc);
        unsc.setColleague1(usa);
        unsc.setColleague2(iraq);

        usa.declare("不要挑衅我！");
        iraq.declare("喜欢挑衅你。");
    }
}
