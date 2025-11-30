package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class PlaylistRecommenderTest {

    @Test
    public void testClassifyEnergy() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);

        String result = PlaylistRecommender.classifyEnergy(list);

        assertEquals(result, null);

    }

    @Test
    // public void testValidTitle() {
    //     String title = "software enginerring";

    //     boolean result = PlaylistRecommender.isValidTrackTitle(title);

    //     assertTrue(result);

    // }

    @Test
    public void testNormalizeVolume() {
        int a = 130;

        int normalized = PlaylistRecommender.normalizeVolume(a);

        assertEquals(normalized, 100);
    }

}
