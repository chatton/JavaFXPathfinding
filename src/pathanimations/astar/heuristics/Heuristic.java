package pathanimations.astar.heuristics;

import graph.Point;

public interface Heuristic {
    int getFor(Point p1, Point p2);
}
