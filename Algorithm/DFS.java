package Algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class DFS {

  public static Map<Integer, List<Integer>> graph = new HashMap<>();

  public static void main(String[] args) {
    addEdge(1, 2);
    addEdge(1, 3);
    addEdge(2, 4);
    addEdge(2, 5);
    addEdge(3, 6);
    addEdge(3, 7);

    int start = 2;
    System.out.println("DFS 방문 탐색 : " + dfs(start));
  }

  private static void addEdge(int u, int v) {
    graph.putIfAbsent(u, new ArrayList<>());
    graph.putIfAbsent(v, new ArrayList<>());
    graph.get(u).add(v);
    graph.get(v).add(u);
  }

  public static Set<Integer> dfs(int start) {

    // DFS 관련 설정
    Set<Integer> visited = new HashSet<>();
    Stack<Integer> stack = new Stack<>();

    // start 초기화 세팅
    stack.push(start);

    while (!stack.isEmpty()) {
      int node = stack.pop();

      // 시작점 부터 방문 시작
      if (!visited.contains(node)) {
        visited.add(node);

        for (int neighbor : graph.get(node)) {
          if (!visited.contains(neighbor)) {
            stack.push(neighbor);
          }
        }
      }

    }
    return visited;
  }
}
