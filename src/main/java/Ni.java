import sun.rmi.runtime.NewThreadAction;

/**
 * @ClassName Ni
 * @Description TODO
 * @Author 余江峰
 * @Date 2019/4/15 11:51
 **/
public class Ni {

    public static void main(String[] args) {
        Test.log(new Throwable().getStackTrace()[0]);
    }
}
