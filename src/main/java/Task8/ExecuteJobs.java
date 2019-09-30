package Task8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class ExecuteJobs implements OrderedJobs {

    private HashMap<Character, ArrayList<Character>> jobs = new HashMap<>();
    private PriorityQueue<Character> characterPriorityQueue = new PriorityQueue<>();

    @Override
    public void register(char job) {
        if (!hasDependency(job)) {
            jobs.put(job, new ArrayList<Character>());
        }
    }

    @Override
    public void register(char job, char dependentJob) throws Exception {
        if (hasDependency(dependentJob)){
            jobs.get(dependentJob).forEach(character -> {
                if (character.compareTo(job) == 0){
                    try {
                        throw new Exception("Loops are not allowed");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        if (hasDependency(job)) {
            ArrayList<Character> characterArrayList = jobs.get(job);
            characterArrayList.add(dependentJob);
            jobs.put(job, characterArrayList);
        } else {
            ArrayList<Character> characterArrayList = new ArrayList<>();
            characterArrayList.add(dependentJob);
            jobs.put(job, characterArrayList);
        }
    }

    @Override
    public String[] sort() {
        feedSort();
        String[] solution = new String[characterPriorityQueue.size()];
        int length = characterPriorityQueue.size();
        for (int i = 0; i < length; i++){
            solution[i] = String.valueOf(characterPriorityQueue.remove());
        }
        return solution;
    }

    private PriorityQueue<Character> feedSort() {
        jobs.forEach(this::sortHelper);
        return characterPriorityQueue;
    }

    private void sortHelper(Character key, ArrayList<Character> value) {
        if (value.size() == 0) {
            // No dependency, add to string array
            if (!characterPriorityQueue.contains(key))
                characterPriorityQueue.add(key);
        } else if (value.size() == 1) {
            // 1 Dependency
            if (!hasDependency(value.get(0))) {
                // That 1 Dependency has no dependencies
                if (!characterPriorityQueue.contains(value.get(0)))
                    characterPriorityQueue.add(value.get(0));
                if (!characterPriorityQueue.contains(key))
                    characterPriorityQueue.add(key);
            } else {
                if (!characterPriorityQueue.contains(key))
                    characterPriorityQueue.add(key);
            }
        } else {
            // More than 1 dependency present
            if (!hasDependency(value)) {
                // Those dependencies do not have more dependencies
                characterPriorityQueue.addAll(value);
                characterPriorityQueue.add(key);
            } else {
                value.forEach(val -> {
                    if (hasDependency(val)) {
                        sortHelper(val, jobs.get(val));
                    } else {
                        if (!characterPriorityQueue.contains(val))
                            characterPriorityQueue.add(val);
                    }
                });
                characterPriorityQueue.add(key);
            }
        }
    }

    private boolean hasDependency(Character ch) {
        return jobs.containsKey(ch);
    }

    private boolean hasDependency(ArrayList<Character> characters) {
        boolean hasDependency = false;
        for (Character character : characters) {
            if (hasDependency(character)) {
                hasDependency = true;
                break;
            }
        }
        return hasDependency;
    }
}
