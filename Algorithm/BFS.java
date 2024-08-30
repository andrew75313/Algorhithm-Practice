package Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import javax.xml.transform.Result;

public class BFS {

  public static Map<Integer, List<Integer>> graph = new HashMap<>();

  public static void main(String[] args) {
    addEdge(1, 2);
    addEdge(1, 3);
    addEdge(2, 4);
    addEdge(2, 5);
    addEdge(3, 6);
    addEdge(3, 7);

    int start = 4;
    int end = 1;

    Results results = bfs(start, end);

    int minPath = results.minPath;
    List<Integer> minRoute = results.minRoute;

    if (minPath == -1) {
      System.out.println("최소경로가 없습니다.");
    } else {
      System.out.println("최소 거리 : " + minPath);
      System.out.println("최소 경로 : " + minRoute);
    }
  }

  // graph 자체에 노드에 관한 간선을 추가하는 메서드
  private static void addEdge(int u, int v) {
    graph.putIfAbsent(u, new ArrayList<>());
    graph.putIfAbsent(v, new ArrayList<>());

    graph.get(u).add(v);
    graph.get(v).add(u);
  }

  private static Results bfs(int start, int end) {
    // 시작 끝 동일
    if (start == end) {
      return new Results(0, null);
    }

    Set<Integer> visited = new HashSet<>();
    Queue<Integer> queue = new LinkedList<>();

    Map<Integer, Integer> distance = new HashMap<>();
    Map<Integer, Integer> parentNode = new HashMap<>();

    // start 넣기
    visited.add(start);
    queue.add(start);

    distance.put(start, 0);
    parentNode.put(start, null);

    while (!queue.isEmpty()) {
      int node =  queue.poll();

      int currentDistance = distance.getOrDefault(node, 0);

      for (int neighbor : graph.get(node)) {
        if (!visited.contains(neighbor)) {
          visited.add(neighbor);
          queue.add(neighbor);

          distance.put(neighbor, currentDistance + 1);
          parentNode.put(neighbor, node);
        }

        if (neighbor == end) {
          int minPath = distance.get(neighbor);
          List<Integer> minRoute = new ArrayList<>();

          // 경로 복기
          Integer currentNode = neighbor;
          while (currentNode != null) {
            minRoute.add(currentNode);
            currentNode = parentNode.get(currentNode);
          }
          Collections.reverse(minRoute);

          return new Results(minPath, minRoute);
        }
      }
    }

    return new Results(-1, null);
  }

  public static class Results {
    int minPath;
    List<Integer> minRoute;

    Results(int minPath, List<Integer> minRoute) {
      this.minPath = minPath;
      this.minRoute = minRoute;
    }
  }
}
