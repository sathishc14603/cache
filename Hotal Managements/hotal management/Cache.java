import java.util.*;
import java.time.LocalTime;

public class Cache {

 Map<String,LocalTime>data=new LinkedHashMap<>();
    public void  addData(String food){
        LocalTime time=LocalTime.now();
        if(data.containsKey(food)){
            data.put(food,time);
        }
        else if(data.size()==5){
            for(Map.Entry<String,LocalTime> entry:data.entrySet()){
                data.remove(entry.getKey());break;
            }
            data.put(food,time);
        }
        else {
            data.put(food,time);
        }
        Iterator<Map.Entry<String, LocalTime>> iterator = data.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, LocalTime> entry = iterator.next();
            LocalTime ti=LocalTime.now();
            long previous=entry.getValue().getHour()*60+entry.getValue().getMinute()*60+entry.getValue().getSecond();
            long current=ti.getHour()*60+ti.getMinute()*60+ti.getSecond();
            if(Math.abs(previous-current)>10){
                System.out.println("This dish is remove because of timelimit--"+entry.getKey());
                iterator.remove();
            }

        }
        System.out.println("This list are present in the ordera");
        for(Map.Entry<String,LocalTime>  entry:data.entrySet()){
            System.out.print(entry.getKey()+" ");
        }


    }
}
