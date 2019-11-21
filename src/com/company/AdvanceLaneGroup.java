package com.company;

public class AdvanceLaneGroup implements NdsLaneGroupFactory {

    public NdsLaneGroup create(int laneGroupId, int laneCount) {
        return new NdsLaneGroup(laneGroupId, laneCount*2);
    }
}