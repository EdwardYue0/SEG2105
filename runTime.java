public class runTime {

    /**
     * Find average time to initialize PointCP
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long initPointCP(char type, long testTimeSeconds){
        long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
        long count = 0;
        long startTime = System.nanoTime();
        long endTime = startTime + testTimeNano;
        while(System.nanoTime() < endTime){
            new PointCP(type, 10*Math.random(), 10*Math.random());
            count++;
        }
        long result = testTimeNano/count;
        return result;
    }

    /**
     * Find average time to initialize PointCP Design 2
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long initPointCP5(char type, long testTimeSeconds){
        long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
        long count = 0;
        long startTime = System.nanoTime();
        long endTime = startTime + testTimeNano;
        while(System.nanoTime() < endTime){
            new PointCP5(type, 10*Math.random(), 10*Math.random());
            count++;
        }
        long result = testTimeNano/count;
        return result;
    }


    /**
     * Find average time to get each Cartesian coordinate from getter method in PointCP
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long getCPointCP(char type, long testTimeSeconds){
        long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
        long count = 0;
        long startTime = System.nanoTime();
        long endTime = startTime + testTimeNano;
        PointCP tmp = new PointCP(type, 10*Math.random(), 10*Math.random());
        while(System.nanoTime() < endTime){
            tmp.getX();
            count++;
            tmp.getY();
            count++;
        }
        long result = testTimeNano/count;
        return result;
    }

    /**
     * Find average time to get each Cartesian coordinate from getter method in PointCP Design 2
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long getCPointCP5(char type, long testTimeSeconds) {
        long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
        long count = 0;
        long startTime = System.nanoTime();
        long endTime = startTime + testTimeNano;
        PointCP5 tmp = new PointCP5(type, 10 * Math.random(), 10 * Math.random());
        while (System.nanoTime() < endTime) {
            tmp.getX();
            count++;
            tmp.getY();
            count++;
        }
        long result = testTimeNano / count;
        return result;
    }


    /**
     * Find average time to get each Polar  coordinate from getter method in PointCP
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long getPPointCP(char type, long testTimeSeconds) {
        long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
        long count = 0;
        long startTime = System.nanoTime();
        long endTime = startTime + testTimeNano;
        PointCP tmp = new PointCP(type, 10 * Math.random(), 10 * Math.random());
        while (System.nanoTime() < endTime) {
            tmp.getRho();
            count++;
            tmp.getTheta();
            count++;
        }
        long result = testTimeNano / count;
        return result;
    }

    /**
     * Find average time to get each Polar  coordinate from getter method in PointCP Design 2
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long getPPointCP5(char type, long testTimeSeconds) {
        long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
        long count = 0;
        long startTime = System.nanoTime();
        long endTime = startTime + testTimeNano;
        PointCP5 tmp = new PointCP5(type, 10 * Math.random(), 10 * Math.random());
        while (System.nanoTime() < endTime) {
            tmp.getRho();
            count++;
            tmp.getTheta();
            count++;
        }
        long result = testTimeNano / count;
        return result;
    }



    /**
     * Main loop to run tests and print results out to user
     * @param args
     */
    public static void main(String[] args){
        int testTime = 10;
        System.out.println("Average time for initializing C PointCP: "+initPointCP('C', testTime)+"ns");
        System.out.println("Average time for initializing C PointCP5: "+initPointCP5('C', testTime)+"ns");
        System.out.println("Average time for initializing P PointCP: "+initPointCP('P', testTime)+"ns");
        System.out.println("Average time for initializing P PointCP5: "+initPointCP5('P', testTime)+"ns");

        System.out.println("Average time for getting Cartesian from Cartesian PointCP: "+getCPointCP('C', testTime)+"ns");
        System.out.println("Average time for getting Cartesian from Cartesian PointCP5: "+getCPointCP5('C', testTime)+"ns");
        System.out.println("Average time for getting Polar from Cartesian PointCP: "+getPPointCP('C', testTime)+"ns");
        System.out.println("Average time for getting Polar from Cartesian PointCP5: "+getPPointCP5('C', testTime)+"ns");

        System.out.println("Average time for getting Cartesian from Polar PointCP: "+getCPointCP('P', testTime)+"ns");
        System.out.println("Average time for getting Cartesian from Polar PointCP5: "+getCPointCP5('P', testTime)+"ns");
        System.out.println("Average time for getting Polar from Polar PointCP: "+getPPointCP('P', testTime)+"ns");
        System.out.println("Average time for getting Polar from Polar PointCP5: "+getPPointCP5('P', testTime)+"ns");
    }
}