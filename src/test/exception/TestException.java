package test.exception;


public class TestException {
	
	/**
     * main函数.
     * @param args
     *            启动参数
     * @throws Exception
     *             Exception
     */
    public static void main(String... args) throws Exception {
	    for (int i = 0; i < 10; i++) {
	        System.out.println("第" + i + "次循环！");
	            int e = 10;
	            e /= 0;
        }
    }

}
