package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {

        int sum = 0;
        int n = 0;
        int average = 0;

        if(bpms.size() == 0){
            return null;
        }
        for(int i = 0; i<bpms.size(); i++){
            sum+= bpms.get(i);
            n+=1;
        }

        average = sum/n;

       if(average >= 140){
        return "HIGH";

       }else if(average > 100 && average < 139 ){
        return "MEDIUM";

       }else
        return null;

    }

    public static boolean isValidTrackTitle(String title) {

        char chatTitle[] = title.toCharArray();

        for(int i = 0; i < chatTitle.length; i++){
            if(chatTitle[i]== ' ' || !(Character.isLetter(chatTitle[i]))){
                return false;
            }
            else{
                if(Character.isLetter(chatTitle[i]) || Character.isWhitespace(chatTitle[i])){
                    continue;
                }
            }
        }
        if(chatTitle.length > 30){
            return false;
        }
        return true;
    }

    public static int normalizeVolume(int volumeDb) {

        if(volumeDb > 100 || volumeDb < 0){
            if(volumeDb > 100){
                volumeDb = 100;
            }
            else
                volumeDb = 0;
        }
        return volumeDb;
    }
}
