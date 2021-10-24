package search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RevenueMilestonesTest {

    @Test
    public void firstMilestone() {
        int revenues_1[] = {100, 200, 300, 400, 500};
        int milestones_1[] = {300, 800, 1000, 1400};
        int expected_1[] = {2, 4, 4, 5};
        int[] output_1 = new RevenueMilestones().getMilestoneDays(revenues_1, milestones_1);
        Assertions.assertArrayEquals(expected_1, output_1);
    }

    @Test
    public void secondMilestone() {
        int revenues_2[] = {700, 800, 600, 400, 600, 700};
        int milestones_2[] = {3100, 2200, 800, 2100, 1000};
        int expected_2[] = {5, 4, 2, 3, 2};
        int[] output_2 = new RevenueMilestones().getMilestoneDays(revenues_2, milestones_2);
        Assertions.assertArrayEquals(expected_2, output_2);
    }
}