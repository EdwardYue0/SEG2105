public class runTime {

    /**
     * Find average time to initialize PointCP
     * @param type char value of either C or P
     * @param testTimes time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long initPointCP(char type, long testTimes){
        long count = 0;
        long startTime = System.currentTimeMillis();
        while(count<testTimes){
            new PointCP(type, 10*Math.random(), 10*Math.random());
            count++;
        }
        long endTime = System.currentTimeMillis();
        long result = endTime-startTime;
        return result;
    }

    /**
     * Find average time to initialize PointCP Design 2
     * @param type char value of either C or P
     * @param testTimes time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long initPointCP2(char type, long testTimes){
        long count = 0;
        long startTime = System.currentTimeMillis();
        while(count<testTimes){
            new PointCP2(type, 10*Math.random(), 10*Math.random());
            count++;
        }
        long endTime = System.currentTimeMillis();
        long result = endTime-startTime;
        return result;
    }


    /**
     * Find average time to get each Cartesian coordinate from getter method in PointCP
     * @param type char value of either C or P
     * @param testTimes time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long getCPointCP(char type, long testTimes){
        long count = 0;
        long startTime = System.currentTimeMillis();
        PointCP tmp = new PointCP(type, 10*Math.random(), 10*Math.random());
        while(count<testTimes){
            tmp.getX();
            count++;
            tmp.getY();
            count++;
        }
        long endTime = System.currentTimeMillis();
        long result = endTime-startTime;
        return result;
    }

    /**
     * Find average time to get each Cartesian coordinate from getter method in PointCP Design 2
     * @param type char value of either C or P
     * @param testTimes time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long getCPointCP2(char type, long testTimes) {
        long count = 0;
        long startTime = System.currentTimeMillis();
        PointCP2 tmp = new PointCP2(type, 10 * Math.random(), 10 * Math.random());
        while (count<testTimes) {
            tmp.getX();
            count++;
            tmp.getY();
            count++;
        }
        long endTime = System.currentTimeMillis();
        long result = endTime-startTime;
        return result;
    }


    /**
     * Find average time to get each Polar  coordinate from getter method in PointCP
     * @param type char value of either C or P
     * @param testTimes time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long getPPointCP(char type, long testTimes) {
        long count = 0;
        long startTime = System.currentTimeMillis();
        PointCP tmp = new PointCP(type, 10 * Math.random(), 10 * Math.random());
        while (count<testTimes) {
            tmp.getRho();
            count++;
            tmp.getTheta();
            count++;
        }
        long endTime = System.currentTimeMillis();
        long result = endTime-startTime;
        return result;
    }

    /**
     * Find average time to get each Polar  coordinate from getter method in PointCP Design 2
     * @param type char value of either C or P
     * @param testTimes time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long getPPointCP2(char type, long testTimes) {
        long count = 0;
        long startTime = System.currentTimeMillis();
        PointCP2 tmp = new PointCP2(type, 10 * Math.random(), 10 * Math.random());
        while (count<testTimes) {
            tmp.getRho();
            count++;
            tmp.getTheta();
            count++;
        }
        long endTime = System.currentTimeMillis();
        long result = endTime-startTime;
        return result;
    }



    /**
     * Main loop to run tests and print results out to user
     * @param args
     */
    public static void main(String[] args){
        int testTimes = 100000000;
        System.out.println("Elapsed time for initializing C PointCP: "+initPointCP('C', testTimes)+"ms");
        System.out.println("Elapsed time for initializing C PointCP2: "+initPointCP2('C', testTimes)+"ms");
        System.out.println("Elapsed time for initializing P PointCP: "+initPointCP('P', testTimes)+"ms");
        System.out.println("Elapsed time for initializing P PointCP2: "+initPointCP2('P', testTimes)+"ms");

        System.out.println("Elapsed time for getting Cartesian from Cartesian PointCP: "+getCPointCP('C', testTimes)+"ms");
        System.out.println("Elapsed time for getting Cartesian from Cartesian PointCP2: "+getCPointCP2('C', testTimes)+"ms");
        System.out.println("Elapsed time for getting Polar from Cartesian PointCP: "+getPPointCP('C', testTimes)+"ms");
        System.out.println("Elapsed time for getting Polar from Cartesian PointCP2: "+getPPointCP2('C', testTimes)+"ms");

        System.out.println("Elapsed time for getting Cartesian from Polar PointCP: "+getCPointCP('P', testTimes)+"ms");
        System.out.println("Elapsed time for getting Cartesian from Polar PointCP2: "+getCPointCP2('P', testTimes)+"ms");
        System.out.println("Elapsed time for getting Polar from Polar PointCP: "+getPPointCP('P', testTimes)+"ms");
        System.out.println("Elapsed time for getting Polar from Polar PointCP2: "+getPPointCP2('P', testTimes)+"ms");
    }
}