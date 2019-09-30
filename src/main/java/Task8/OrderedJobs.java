package Task8;

public interface OrderedJobs {
        void register(char job);
        void register(char job, char dependentJob) throws Exception;
        String[] sort();
}
