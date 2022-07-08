package chapter6;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// https://stepik.org/lesson/562761/step/3
class Partitioner {

    public static Map<Boolean, List<Application>> getPartition(List<Application> applications) {
       return applications.stream().collect(Collectors.partitioningBy(Application::isFree)); // write your code here
    }
}

class Application {
    private final String name;
    private final boolean isFree;

    public Application(String name, boolean isFree) {
        this.name = name;
        this.isFree = isFree;
    }

    public String getName() {
        return name;
    }

    public boolean isFree() {
        return isFree;
    }
}