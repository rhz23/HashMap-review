package program;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> braStatesList = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println(braStatesList);

        braStatesList.put("RN", 3534165);

        System.out.println(braStatesList);

        if(!braStatesList.containsKey("PB")){
            braStatesList.put("PB", 4039277);
        }

        System.out.println(braStatesList);

        System.out.println(braStatesList.get("PE"));

        Map<String, Integer> braStatesLinkedList = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println(braStatesLinkedList);

        Map<String, Integer> braStatesTreeMapList = new TreeMap<>(braStatesList);
        System.out.println(braStatesTreeMapList);

        //exibir o estado com maior população
        int biggestState = Collections.max(braStatesList.values());

        for (Map.Entry<String, Integer> entries : braStatesTreeMapList.entrySet()) {
            if(entries.getValue() == biggestState){
                System.out.println(entries.getKey());
            }
        }

        //exibir a soma da população destes estados
        int soma = 0;
        for (Map.Entry<String, Integer> entries : braStatesTreeMapList.entrySet()) {
            soma += entries.getValue();
            }
        System.out.println(soma);

        //exibir a media da população destes estados
        int soma1 = 0;
        for (Map.Entry<String, Integer> entries : braStatesTreeMapList.entrySet()) {
            soma1 += entries.getValue();
        }
        System.out.println(soma1/braStatesTreeMapList.size());


        System.out.println("remova os estados com população menor que 4000000");
        //remova os estados com população menor que 4000000
        Iterator<Integer> iterator1 = braStatesTreeMapList.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next() < 4000000){
                iterator1.remove();
            }
        }

        System.out.println(braStatesTreeMapList);


        //apague o dicionario

        braStatesTreeMapList.clear();
        System.out.println(braStatesTreeMapList);

        //confira se o dicionario esta vazio
        System.out.println(braStatesTreeMapList.isEmpty());

    }
}
