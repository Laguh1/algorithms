package search;

public class RevenueMilestones {

    int[] getMilestoneDays(int[] revenues, int[] milestones) {
        int[] response = new int[milestones.length];

        for (int indexM = 0; indexM < milestones.length; indexM++) {
            int totalRevenue = 0;
            for (int index = 0; index < revenues.length; index++) {
                totalRevenue = totalRevenue + revenues[index];
                if (totalRevenue >= milestones[indexM]) {
                    response[indexM] = index + 1;
                    break;
                }
            }
        }
        return response;
    }
}
