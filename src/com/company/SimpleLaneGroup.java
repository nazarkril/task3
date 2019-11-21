package com.company;

public class SimpleLaneGroup implements NdsLaneGroupFactory{

    public NdsLaneGroup create(int laneGroupId, int laneCount){
        return new NdsLaneGroup(laneGroupId, laneCount);

    };

}