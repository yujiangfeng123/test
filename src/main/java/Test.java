 /*
  * @author: 余江峰
  * @date: 2019/4/15 14:10
  * @Description: 获取类名和行号
  * @param:
  * @return:
  */
public class Test {
     /*
      * @author: 余江峰
      * @date: 2019/4/15 14:28
      * @Description:  打印日志输出错误的类名和行好
      * @param:
      * @return:
      */
    public static void  log(StackTraceElement ste) {
        //StackTraceElement ste = new Throwable().getStackTrace()[0];
        String className = ste.getFileName();
        System.out.println("类名:" + className.substring(0, className.indexOf(".")) + ": 行号 " + ste.getLineNumber());
    }

}
