package Task9;

public class Main {

    private static BlockingQueue<Integer> blockingQueue = new BlockingQueue<Integer>(2);

    public static void main(String[] args) throws Exception {

        blockingQueue.add(1);
        System.out.println(blockingQueue);
        blockingQueue.remove();
        System.out.println(blockingQueue);
        blockingQueue.add(2);
        blockingQueue.add(3);
        System.out.println(blockingQueue);
        delayAddingOfElement(4);
        delayRemovingOfElement();
        delayRemovingOfElement();

        new java.util.Timer().schedule( new java.util.TimerTask() {
                                            @Override
                                            public void run() {
                                                try {
                                                    System.out.println(blockingQueue);
                                                    System.exit(0);
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                }
                                            }
                                        },
                3000
        );

    }

    private static <T> void delayAddingOfElement(int element) {
        new java.util.Timer().schedule( new java.util.TimerTask() {
                                            @Override
                                            public void run() {
                                                try {
                                                    blockingQueue.add(element);
                                                    System.out.println(blockingQueue);
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                }
                                            }
                                        },
                1000
        );
    }

    private static <T> void delayRemovingOfElement() {
        new java.util.Timer().schedule( new java.util.TimerTask() {
                                            @Override
                                            public void run() {
                                                try {
                                                    blockingQueue.remove();
                                                    System.out.println("Removing the element");
                                                    System.out.println(blockingQueue);
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                }
                                            }
                                        },
                1300
        );
    }

}
