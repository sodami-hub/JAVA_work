import java.util.Arrays;
import java.util.HashMap;

public class Test27 {

    public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] result = new int[enroll.length];

        HashMap<String, Integer> enrollIndex = new HashMap<>();
        for(int i = 0; i< enroll.length; i++) {
            enrollIndex.put(enroll[i],i);
        }

        HashMap<String,String> enrollAndReferral = new HashMap<>();
        for(int i =0; i< enroll.length; i ++) {
            enrollAndReferral.put(enroll[i],referral[i]);
        }

        int targetPersonTotalIncome;
        String targetPerson ="";
        int targetIndex;

        for (int i = 0; i < seller.length; i++) {
            targetPerson = seller[i];
            targetPersonTotalIncome = (amount[i]*100);

            while(!targetPerson.equals("-")) {
                targetIndex = enrollIndex.get(targetPerson);
                result[targetIndex] += (int)(targetPersonTotalIncome*0.9);

                targetPerson = enrollAndReferral.get(targetPerson);
                targetPersonTotalIncome = (int)(targetPersonTotalIncome*0.1);

            }
        }


        return result;
    }

    public static void main(String[] args) {

        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"young", "john", "tod", "emily", "mary"};
        int[] amount = {12, 4, 2, 5, 10};
        int[] result = solution(enroll, referral, seller, amount);
        System.out.println(Arrays.toString(result));


    }
}
