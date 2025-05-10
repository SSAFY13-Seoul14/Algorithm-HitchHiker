# 알고리즘 문제 학습 로드맵

## 활용 안내

한 세트는 총 4개의 소단원으로 구분되어 있습니다. 각 소단원에는 4~5개정도의 문제가 실려 있으며, 난이도 순은 아닙니다. *가 달린 문제는 심화 문제이거나 매우 유사한 문제입니다. 알고리즘 초보 딱지를 떼기 위한 목적으로 다양한 유형의 기초 문제들을 계단식으로 학습할 수 있도록 주제들을 배치하였습니다. C를 문제 해결에 무리 없이 활용할 수 있는 수준에 도달했을 때 시작하는 것을 전제 조건으로 하였습니다.

## 목차

### SET 1-4
- [1-1. 탐색과 정렬 (1)](#1-1-탐색과-정렬-1)
- [1-2. 기초 자료구조 (1)](#1-2-기초-자료구조-1)
- [1-3. 탐색과 정렬 (2)](#1-3-탐색과-정렬-2)
- [1-4. 기초 자료구조 (2)](#1-4-기초-자료구조-2)
- [2-1. 백트래킹 (1)](#2-1-백트래킹-1)
- [2-2. 기초 수학 (1)](#2-2-기초-수학-1)
- [2-3. 백트래킹 (2)](#2-3-백트래킹-2)
- [2-4. 기초 수학 (2)](#2-4-기초-수학-2)
- [3-1. DFS와 BFS (1)](#3-1-dfs와-bfs-1)
- [3-2. 기초 다이나믹 프로그래밍 (1)](#3-2-기초-다이나믹-프로그래밍-1)
- [3-3. DFS와 BFS (2)](#3-3-dfs와-bfs-2)
- [3-4. 기초 다이나믹 프로그래밍 (2)](#3-4-기초-다이나믹-프로그래밍-2)
- [4-1. 그리디 알고리즘 (1)](#4-1-그리디-알고리즘-1)
- [4-2. 파라메트릭 서치 (1)](#4-2-파라메트릭-서치-1)
- [4-3. 힙](#4-3-힙)
- [4-4. 그리디 알고리즘 (2)](#4-4-그리디-알고리즘-2)

### SET 5-8
- [5-1. 파라메트릭 서치 (2)](#5-1-파라메트릭-서치-2)
- [5-2. 다이나믹 프로그래밍 (1)](#5-2-다이나믹-프로그래밍-1)
- [5-3. 분할 정복 (1)](#5-3-분할-정복-1)
- [5-4. 유니온-파인드 트리 (1)](#5-4-유니온-파인드-트리-1)
- [6-1. 최단 경로 알고리즘 (1)](#6-1-최단-경로-알고리즘-1)
- [6-2. 다이나믹 프로그래밍 (2)](#6-2-다이나믹-프로그래밍-2)
- [6-3. 최단 경로 알고리즘 (2)](#6-3-최단-경로-알고리즘-2)
- [6-4. 최소 스패닝 트리](#6-4-최소-스패닝-트리)
- [7-1. 위상 정렬](#7-1-위상-정렬)
- [7-2. 펜윅 트리와 세그먼트 트리 (1)](#7-2-펜윅-트리와-세그먼트-트리-1)
- [7-3. DFS와 BFS (3)](#7-3-dfs와-bfs-3)
- [7-4. 펜윅 트리와 세그먼트 트리 (2)](#7-4-펜윅-트리와-세그먼트-트리-2)
- [8-1. 계산 기하 (1)](#8-1-계산-기하-1)
- [8-2. 선형 자료구조의 활용](#8-2-선형-자료구조의-활용)
- [8-3. 문자열 (1)](#8-3-문자열-1)
- [8-4. 다이나믹 프로그래밍 (3)](#8-4-다이나믹-프로그래밍-3)

### SET 9 및 기타
- [9-1. 유니온-파인드 트리 (2)](#9-1-유니온-파인드-트리-2)
- [9-2. 다이나믹 프로그래밍 (4)](#9-2-다이나믹-프로그래밍-4)
- [9-3. 세그먼트 트리의 활용 (1)](#9-3-세그먼트-트리의-활용-1)
- [9-4. DFS 스패닝 트리의 활용 (1)](#9-4-dfs-스패닝-트리의-활용-1)
- [?-1. 계산 기하 (2)](#-1-계산-기하-2)
- [?-2. 문자열 (2)](#-2-문자열-2)
- [X-1. DFS 스패닝 트리의 활용 (2)](#x-1-dfs-스패닝-트리의-활용-2)

---

## SET 1

### 1-1. 탐색과 정렬 (1)

**문제를 풀기 전에 공부하기**: 이진 탐색, O(nlgn) 정렬, 카운팅 정렬

**학습 유의사항**: 이분 탐색과 정렬을 직접 구현해도 좋지만, std::binary_search, std::lower_bound/std::upper_bound, std::sort 등의 STL을 제대로 익히고 가자.

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 1920 | A – 수 찾기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/7.svg) | [문제 링크](https://www.acmicpc.net/problem/1920) |
| 2750 | B – 수 정렬하기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/4.svg) | [문제 링크](https://www.acmicpc.net/problem/2750) |
| 2751 | C – 수 정렬하기 2 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/6.svg) | [문제 링크](https://www.acmicpc.net/problem/2751) |
| 10989 | D – 수 정렬하기 3 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/5.svg) | [문제 링크](https://www.acmicpc.net/problem/10989) |
| 10815 | E – 숫자 카드 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/6.svg) | [문제 링크](https://www.acmicpc.net/problem/10815) |

### 1-2. 기초 자료구조 (1)

**문제를 풀기 전에 공부하기**: 스택, 큐, 덱, 연결 리스트

**학습 유의사항**: 역시 자료구조를 직접 구현하기보다는 std::stack, std::queue, std::deque, std::list를 활용하는 방향으로 학습해 보자.

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 10828 | A – 스택 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/7.svg) | [문제 링크](https://www.acmicpc.net/problem/10828) |
| 10845 | B – 큐 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/7.svg) | [문제 링크](https://www.acmicpc.net/problem/10845) |
| 10866 | C – 덱 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/7.svg) | [문제 링크](https://www.acmicpc.net/problem/10866) |
| 1406 | D – 에디터 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/9.svg) | [문제 링크](https://www.acmicpc.net/problem/1406) |

### 1-3. 탐색과 정렬 (2)

**문제를 풀기 전에 공부하기**: X

**학습 유의사항**: std::unique와 std::lower_bound와 std::upper_bound를 함께 활용해 개수를 구하는 테크닉은 매우 자주 등장한다. 또한 std::sort의 비교 함수 지정은 반드시 알아두어야 한다.

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 1026 | A – 보물 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/7.svg) | [문제 링크](https://www.acmicpc.net/problem/1026) |
| 1181 | B – 단어 정렬 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/6.svg) | [문제 링크](https://www.acmicpc.net/problem/1181) |
| 11650 | C – 좌표 정렬하기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/6.svg) | [문제 링크](https://www.acmicpc.net/problem/11650) |
| 11651 | C* - 좌표 정렬하기 2 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/6.svg) | [문제 링크](https://www.acmicpc.net/problem/11651) |
| 10867 | D – 중복 빼고 정렬하기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/6.svg) | [문제 링크](https://www.acmicpc.net/problem/10867) |
| 10816 | E – 숫자 카드 2 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/7.svg) | [문제 링크](https://www.acmicpc.net/problem/10816) |

### 1-4. 기초 자료구조 (2)

**문제를 풀기 전에 공부하기**: X

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 9012 | A – 괄호 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/7.svg) | [문제 링크](https://www.acmicpc.net/problem/9012) |
| 1874 | B – 스택 수열 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/9.svg) | [문제 링크](https://www.acmicpc.net/problem/1874) |
| 1158 | C – 조세퍼스 문제 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/7.svg) | [문제 링크](https://www.acmicpc.net/problem/1158) |
| 1966 | D – 프린터 큐 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/8.svg) | [문제 링크](https://www.acmicpc.net/problem/1966) |
| 5430 | E – AC | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/11.svg) | [문제 링크](https://www.acmicpc.net/problem/5430) |

---

## SET 2

### 2-1. 백트래킹 (1)

**문제를 풀기 전에 공부하기**: 백트래킹

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 6603 | A – 로또 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/9.svg) | [문제 링크](https://www.acmicpc.net/problem/6603) |
| 1182 | B – 부분집합의 합 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/9.svg) | [문제 링크](https://www.acmicpc.net/problem/1182) |
| 9095 | C – 1, 2, 3 더하기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/8.svg) | [문제 링크](https://www.acmicpc.net/problem/9095) |
| 9663 | D – N-Queen | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/9663) |

### 2-2. 기초 수학 (1)

**문제를 풀기 전에 공부하기**: 에라토스테네스의 체, 유클리드 호제법

**학습 유의사항**: 최대한 효율적으로 구현할 수 있는 방법을 생각하며 구현해 보자.

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 1037 | A – 약수 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/5.svg) | [문제 링크](https://www.acmicpc.net/problem/1037) |
| 1978 | B – 소수 찾기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/4.svg) | [문제 링크](https://www.acmicpc.net/problem/1978) |
| 1929 | C – 소수 구하기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/8.svg) | [문제 링크](https://www.acmicpc.net/problem/1929) |
| 2609 | D – 최대공약수와 최소공배수 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/5.svg) | [문제 링크](https://www.acmicpc.net/problem/2609) |

### 2-3. 백트래킹 (2)

**문제를 풀기 전에 공부하기**: X

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 14889 | A – 스타트와 링크 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/10.svg) | [문제 링크](https://www.acmicpc.net/problem/14889) |
| 15686 | B – 치킨 배달 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/11.svg) | [문제 링크](https://www.acmicpc.net/problem/15686) |
| 2661 | C – 좋은수열 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/2661) |
| 2580 | D – 스도쿠 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/2580) |

### 2-4. 기초 수학 (2)

**문제를 풀기 전에 공부하기**: X

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 2485 | A – 가로수 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/7.svg) | [문제 링크](https://www.acmicpc.net/problem/2485) |
| 1644 | B – 소수의 연속합 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/13.svg) | [문제 링크](https://www.acmicpc.net/problem/1644) |
| 6588 | C – 골드바흐의 추측 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/10.svg) | [문제 링크](https://www.acmicpc.net/problem/6588) |
| 15711 | C* - 환상의 짝꿍 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/13.svg) | [문제 링크](https://www.acmicpc.net/problem/15711) |
| 1016 | D – 제곱 ㄴㄴ 수 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/15.svg) | [문제 링크](https://www.acmicpc.net/problem/1016) |

---

## SET 3

### 3-1. DFS와 BFS (1)

**문제를 풀기 전에 공부하기**: DFS와 BFS

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 1260 | A – DFS와 BFS | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/9.svg) | [문제 링크](https://www.acmicpc.net/problem/1260) |
| 2667 | B – 단지번호붙이기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/10.svg) | [문제 링크](https://www.acmicpc.net/problem/2667) |
| 1697 | C – 숨바꼭질 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/10.svg) | [문제 링크](https://www.acmicpc.net/problem/1697) |
| 2178 | D – 미로 탐색 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/10.svg) | [문제 링크](https://www.acmicpc.net/problem/2178) |
| 2606 | E – 바이러스 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/8.svg) | [문제 링크](https://www.acmicpc.net/problem/2606) |

### 3-2. 기초 다이나믹 프로그래밍 (1)

**문제를 풀기 전에 공부하기**: 다이나믹 프로그래밍

**학습 유의사항**: 다이나믹 프로그래밍은 탑다운 방식과 바텀업 방식이 있다. 특정 문제는 둘 중 한 가지 방법으로만 풀리기도 하니, 둘의 장단점을 비교해서 두 방식으로 모두 문제를 해결할 수 있도록 하자.

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 1003 | A – 피보나치 함수 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/8.svg) | [문제 링크](https://www.acmicpc.net/problem/1003) |
| 1463 | B – 1로 만들기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/8.svg) | [문제 링크](https://www.acmicpc.net/problem/1463) |
| 2579 | C – 계단 오르기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/8.svg) | [문제 링크](https://www.acmicpc.net/problem/2579) |
| 1932 | D – 정수 삼각형 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/10.svg) | [문제 링크](https://www.acmicpc.net/problem/1932) |
| 1149 | E – RGB거리 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/10.svg) | [문제 링크](https://www.acmicpc.net/problem/1149) |

### 3-3. DFS와 BFS (2)

**문제를 풀기 전에 공부하기**: X

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 2206 | A – 벽 부수고 이동하기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/13.svg) | [문제 링크](https://www.acmicpc.net/problem/2206) |
| 7576 | B – 토마토 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/11.svg) | [문제 링크](https://www.acmicpc.net/problem/7576) |
| 7569 | B* – 토마토 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/11.svg) | [문제 링크](https://www.acmicpc.net/problem/7569) |
| 9466 | C – 텀 프로젝트 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/13.svg) | [문제 링크](https://www.acmicpc.net/problem/9466) |
| 2636 | D – 치즈 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/2636) |
| 2583 | E – 영역 구하기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/10.svg) | [문제 링크](https://www.acmicpc.net/problem/2583) |

### 3-4. 기초 다이나믹 프로그래밍 (2)

**문제를 풀기 전에 공부하기**: X

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 11726 | A – 2×n 타일링 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/8.svg) | [문제 링크](https://www.acmicpc.net/problem/11726) |
| 11727 | A* - 2×n 타일링 2 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/8.svg) | [문제 링크](https://www.acmicpc.net/problem/11727) |
| 1912 | B – 연속합 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/9.svg) | [문제 링크](https://www.acmicpc.net/problem/1912) |
| 2293 | C – 동전 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/2293) |
| 2156 | D – 포도주 시식 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/10.svg) | [문제 링크](https://www.acmicpc.net/problem/2156) |
| 11052 | E – 카드 구매하기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/10.svg) | [문제 링크](https://www.acmicpc.net/problem/11052) |
| 11053 | F – 가장 긴 증가하는 부분 수열 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/9.svg) | [문제 링크](https://www.acmicpc.net/problem/11053) |

---

## SET 4

### 4-1. 그리디 알고리즘 (1)

**문제를 풀기 전에 공부하기**: 그리디 알고리즘

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 11047 | A – 동전 0 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/7.svg) | [문제 링크](https://www.acmicpc.net/problem/11047) |
| 1931 | B – 회의실배정 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/11.svg) | [문제 링크](https://www.acmicpc.net/problem/1931) |
| 2217 | C – 로프 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/7.svg) | [문제 링크](https://www.acmicpc.net/problem/2217) |
| 2529 | D – 부등호 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/10.svg) | [문제 링크](https://www.acmicpc.net/problem/2529) |

### 4-2. 파라메트릭 서치 (1)

**문제를 풀기 전에 공부하기**: 파라메트릭 서치

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 2805 | A – 나무 자르기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/9.svg) | [문제 링크](https://www.acmicpc.net/problem/2805) |
| 1654 | B – 랜선 자르기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/9.svg) | [문제 링크](https://www.acmicpc.net/problem/1654) |
| 2869 | C – 달팽이는 올라가고 싶다 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/5.svg) | [문제 링크](https://www.acmicpc.net/problem/2869) |
| 2512 | D – 예산 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/9.svg) | [문제 링크](https://www.acmicpc.net/problem/2512) |
| 2110 | E – 공유기 설치 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/2110) |

### 4-3. 힙

**문제를 풀기 전에 공부하기**: 힙

**학습 유의사항**: std::priority_queue에서 최대 힙의 구현체를 제공한다. 우선순위 큐에 연산자를 추가로 넣는 방법을 반드시 알고 가자.

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 1927 | A – 최소 힙 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/9.svg) | [문제 링크](https://www.acmicpc.net/problem/1927) |
| 11279 | A* - 최대 힙 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/9.svg) | [문제 링크](https://www.acmicpc.net/problem/11279) |
| 11286 | B – 절댓값 힙 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/10.svg) | [문제 링크](https://www.acmicpc.net/problem/11286) |
| 1715 | C – 카드 정렬하기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/1715) |
| 1655 | D – 가운데를 말해요 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/14.svg) | [문제 링크](https://www.acmicpc.net/problem/1655) |

### 4-4. 그리디 알고리즘 (2)

**문제를 풀기 전에 공부하기**: X

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 1202 | A – 보석 도둑 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/14.svg) | [문제 링크](https://www.acmicpc.net/problem/1202) |
| 9576 | B – 책 나눠주기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/14.svg) | [문제 링크](https://www.acmicpc.net/problem/9576) |
| 13305 | C - 주유소 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/8.svg) | [문제 링크](https://www.acmicpc.net/problem/13305) |
| 1826 | C* – 연료 채우기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/14.svg) | [문제 링크](https://www.acmicpc.net/problem/1826) |
| 1422 | D – 숫자의 신 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/17.svg) | [문제 링크](https://www.acmicpc.net/problem/1422) |

---

## SET 5

### 5-1. 파라메트릭 서치 (2)

**문제를 풀기 전에 공부하기**: X

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 1939 | A – 중량제한 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/13.svg) | [문제 링크](https://www.acmicpc.net/problem/1939) |
| 2585 | B – 경비행기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/14.svg) | [문제 링크](https://www.acmicpc.net/problem/2585) |
| 3079 | C – 입국심사 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/11.svg) | [문제 링크](https://www.acmicpc.net/problem/3079) |
| 3090 | D – 차이를 최소로 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/19.svg) | [문제 링크](https://www.acmicpc.net/problem/3090) |

### 5-2. 다이나믹 프로그래밍 (1)

**문제를 풀기 전에 공부하기**: X

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 1890 | A – 점프 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/10.svg) | [문제 링크](https://www.acmicpc.net/problem/1890) |
| 1520 | B – 내리막길 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/13.svg) | [문제 링크](https://www.acmicpc.net/problem/1520) |
| 12015 | C – 가장 긴 증가하는 부분 수열 2 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/14.svg) | [문제 링크](https://www.acmicpc.net/problem/12015) |
| 9251 | D – LCS | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/11.svg) | [문제 링크](https://www.acmicpc.net/problem/9251) |
| 9252 | D* - LCS 2 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/9252) |
| 11051 | E – 이항 계수 2 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/9.svg) | [문제 링크](https://www.acmicpc.net/problem/11051) |

### 5-3. 분할 정복 (1)

**문제를 풀기 전에 공부하기**: 분할 정복

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 1992 | A - 쿼드 트리 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/10.svg) | [문제 링크](https://www.acmicpc.net/problem/1992) |
| 11729 | B – 하노이 탑 이동 순서 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/11.svg) | [문제 링크](https://www.acmicpc.net/problem/11729) |
| 10827 | C – a^b | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/11.svg) | [문제 링크](https://www.acmicpc.net/problem/10827) |
| 2261 | D – 가장 가까운 두 점 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/19.svg) | [문제 링크](https://www.acmicpc.net/problem/2261) |

### 5-4. 유니온-파인드 트리 (1)

**문제를 풀기 전에 공부하기**: 유니온-파인드 트리

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 1717 | A – 집합의 표현 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/11.svg) | [문제 링크](https://www.acmicpc.net/problem/1717) |
| 4195 | B – 친구 네트워크 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/14.svg) | [문제 링크](https://www.acmicpc.net/problem/4195) |
| 1976 | C – 여행 가자 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/1976) |
| 10775 | D – 공항 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/14.svg) | [문제 링크](https://www.acmicpc.net/problem/10775) |

---

## SET 6

### 6-1. 최단 경로 알고리즘 (1)

**문제를 풀기 전에 공부하기**: 다익스트라 알고리즘

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 1753 | A – 최단경로 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/1753) |
| 1916 | A* - 최소비용 구하기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/11.svg) | [문제 링크](https://www.acmicpc.net/problem/1916) |
| 1238 | B – 파티 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/13.svg) | [문제 링크](https://www.acmicpc.net/problem/1238) |
| 1261 | C – 알고스팟 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/1261) |
| 4485 | C* - 녹색 옷 입은 애가 젤다지? | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/4485) |
| 1504 | D – 특정한 최단 경로 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/1504) |

### 6-2. 다이나믹 프로그래밍 (2)

**문제를 풀기 전에 공부하기**: X

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 2618 | A – 경찰차 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/17.svg) | [문제 링크](https://www.acmicpc.net/problem/2618) |
| 1915 | B – 가장 큰 정사각형 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/1915) |
| 11066 | C – 파일 합치기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/13.svg) | [문제 링크](https://www.acmicpc.net/problem/11066) |
| 2631 | D – 줄세우기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/2631) |

### 6-3. 최단 경로 알고리즘 (2)

**문제를 풀기 전에 공부하기**: 벨만-포드 알고리즘, 플로이드 알고리즘

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 11657 | A – 타임머신 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/11657) |
| 11404 | B – 플로이드 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/11404) |
| 10159 | C – 저울 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/10159) |
| 1613 | D – 역사 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/13.svg) | [문제 링크](https://www.acmicpc.net/problem/1613) |

### 6-4. 최소 스패닝 트리

**문제를 풀기 전에 공부하기**: 크루스칼 알고리즘, 프림 알고리즘

**학습 유의사항**: 크루스칼 알고리즘이 프림 알고리즘보다 비교적 자주 쓰인다. 두 알고리즘 모두 MST에 대한 핵심적인 통찰을 담고 있으니 정당성을 생각해 보며 문제를 풀어 보자.

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 1197 | A - 최소 스패닝 트리 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/1197) |
| 1647 | B – 도시 분할 계획 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/1647) |
| 2887 | C – 행성 터널 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/16.svg) | [문제 링크](https://www.acmicpc.net/problem/2887) |

---

## SET 7

### 7-1. 위상 정렬

**문제를 풀기 전에 공부하기**: 위상 정렬

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 2252 | A – 줄 세우기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/13.svg) | [문제 링크](https://www.acmicpc.net/problem/2252) |
| 1005 | B – ACM Craft | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/13.svg) | [문제 링크](https://www.acmicpc.net/problem/1005) |
| 1766 | C – 문제집 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/14.svg) | [문제 링크](https://www.acmicpc.net/problem/1766) |
| 3665 | D – 최종 순위 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/15.svg) | [문제 링크](https://www.acmicpc.net/problem/3665) |

### 7-2. 펜윅 트리와 세그먼트 트리 (1)

**문제를 풀기 전에 공부하기**: 펜윅 트리, 세그먼트 트리

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 2042 | A - 구간 합 구하기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/15.svg) | [문제 링크](https://www.acmicpc.net/problem/2042) |
| 2357 | B – 최솟값과 최댓값 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/15.svg) | [문제 링크](https://www.acmicpc.net/problem/2357) |
| 7578 | C – 공장 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/16.svg) | [문제 링크](https://www.acmicpc.net/problem/7578) |
| 11505 | D – 구간 곱 구하기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/15.svg) | [문제 링크](https://www.acmicpc.net/problem/11505) |

### 7-3. DFS와 BFS (3)

**문제를 풀기 전에 공부하기**: X

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 1967 | A – 트리의 지름 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/1967) |
| 14867 | B – 물통 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/14.svg) | [문제 링크](https://www.acmicpc.net/problem/14867) |
| 1726 | C – 로봇 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/13.svg) | [문제 링크](https://www.acmicpc.net/problem/1726) |
| 6087 | D – 레이저 통신 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/13.svg) | [문제 링크](https://www.acmicpc.net/problem/6087) |

### 7-4. 펜윅 트리와 세그먼트 트리 (2)

**문제를 풀기 전에 공부하기**: X

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 3653 | A – 영화 수집 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/17.svg) | [문제 링크](https://www.acmicpc.net/problem/3653) |
| 2243 | B – 사탕상자 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/16.svg) | [문제 링크](https://www.acmicpc.net/problem/2243) |
| 5676 | C – 음주 코딩 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/15.svg) | [문제 링크](https://www.acmicpc.net/problem/5676) |
| 1849 | D – 순열 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/17.svg) | [문제 링크](https://www.acmicpc.net/problem/1849) |
| 2336 | E – 굉장한 학생 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/19.svg) | [문제 링크](https://www.acmicpc.net/problem/2336) |

---

## SET 8

### 8-1. 계산 기하 (1)

**문제를 풀기 전에 공부하기**: 기초적인 기하 알고리즘(CCW, 면적 구하기, 직선 교차 구하기 등), 볼록 껍질 구하는 알고리즘(Graham's Scan, Andrew's Algorithm)

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 11758 | A – CCW | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/11.svg) | [문제 링크](https://www.acmicpc.net/problem/11758) |
| 2166 | B – 다각형의 면적 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/11.svg) | [문제 링크](https://www.acmicpc.net/problem/2166) |
| 3679 | C – 단순 다각형 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/17.svg) | [문제 링크](https://www.acmicpc.net/problem/3679) |
| 6487 | D – 두 직선의 교차 여부 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/10.svg) | [문제 링크](https://www.acmicpc.net/problem/6487) |
| 1708 | E – 볼록 껍질 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/16.svg) | [문제 링크](https://www.acmicpc.net/problem/1708) |

### 8-2. 선형 자료구조의 활용

**문제를 풀기 전에 공부하기**: 슬라이딩 윈도우

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 2493 | A – 탑 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/11.svg) | [문제 링크](https://www.acmicpc.net/problem/2493) |
| 6198 | B – 옥상 정원 꾸미기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/11.svg) | [문제 링크](https://www.acmicpc.net/problem/6198) |
| 6549 | C – 히스토그램에서 가장 큰 직사각형 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/16.svg) | [문제 링크](https://www.acmicpc.net/problem/6549) |
| 11003 | D – 최솟값 찾기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/16.svg) | [문제 링크](https://www.acmicpc.net/problem/11003) |

### 8-3. 문자열 (1)

**문제를 풀기 전에 공부하기**: KMP 알고리즘, 접미사 배열

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 1786 | A – 찾기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/16.svg) | [문제 링크](https://www.acmicpc.net/problem/1786) |
| 1305 | B – 광고 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/17.svg) | [문제 링크](https://www.acmicpc.net/problem/1305) |
| 11656 | C – 접미사 배열 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/7.svg) | [문제 링크](https://www.acmicpc.net/problem/11656) |
| 5052 | D – 전화번호 목록 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/12.svg) | [문제 링크](https://www.acmicpc.net/problem/5052) |

### 8-4. 다이나믹 프로그래밍 (3)

**문제를 풀기 전에 공부하기**: 비트마스크

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 2098 | A – 외판원 순회 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/15.svg) | [문제 링크](https://www.acmicpc.net/problem/2098) |
| 1102 | B – 발전소 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/16.svg) | [문제 링크](https://www.acmicpc.net/problem/1102) |
| 2718 | C – 타일 채우기 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/15.svg) | [문제 링크](https://www.acmicpc.net/problem/2718) |
| 1657 | D – 두부 장수 장홍준 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/18.svg) | [문제 링크](https://www.acmicpc.net/problem/1657) |

---

## SET 9

### 9-1. 유니온-파인드 트리 (2)

**문제를 풀기 전에 공부하기**: X

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 2463 | A - 비용 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/16.svg) | [문제 링크](https://www.acmicpc.net/problem/2463) |
| 13306 | B - 트리 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/17.svg) | [문제 링크](https://www.acmicpc.net/problem/13306) |
| 15586 | C - Mootube (Gold) | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/17.svg) | [문제 링크](https://www.acmicpc.net/problem/15586) |

### 9-2. 다이나믹 프로그래밍 (4)

**문제를 풀기 전에 공부하기**: X

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 2449 | A – 전구 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/18.svg) | [문제 링크](https://www.acmicpc.net/problem/2449) |
| 16157 | B – 블로그 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/17.svg) | [문제 링크](https://www.acmicpc.net/problem/16157) |
| 2213 | C – 트리의 독립집합 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/15.svg) | [문제 링크](https://www.acmicpc.net/problem/2213) |
| 2300 | D – 기지국 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/14.svg) | [문제 링크](https://www.acmicpc.net/problem/2300) |

### 9-3. 세그먼트 트리의 활용 (1)

**문제를 풀기 전에 공부하기**: 레이지 프로파게이션

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 10999 | A – 구간 합 구하기 2 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/17.svg) | [문제 링크](https://www.acmicpc.net/problem/10999) |
| 1395 | B – 스위치 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/18.svg) | [문제 링크](https://www.acmicpc.net/problem/1395) |
| 12844 | C – XOR | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/18.svg) | [문제 링크](https://www.acmicpc.net/problem/12844) |
| 2820 | D – 자동차 공장 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/18.svg) | [문제 링크](https://www.acmicpc.net/problem/2820) |

### 9-4. DFS 스패닝 트리의 활용 (1)

**문제를 풀기 전에 공부하기**: DFS 스패닝 트리, 타잔의 알고리즘, 코사라주의 알고리즘, 오일러 투어

**학습 유의사항**: 학습량이 많습니다. 타잔과 코사라주의 알고리즘의 차이점을 명확하게 비교하면서 학습합시다.

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 11266 | A – 단절점 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/17.svg) | [문제 링크](https://www.acmicpc.net/problem/11266) |
| 11400 | B – 단절선 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/17.svg) | [문제 링크](https://www.acmicpc.net/problem/11400) |
| 2150 | C – Strongly Connected Component | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/16.svg) | [문제 링크](https://www.acmicpc.net/problem/2150) |
| 1199 | D – 오일러 회로 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/17.svg) | [문제 링크](https://www.acmicpc.net/problem/1199) |

---

## 추후 추가 예정 단원

### ?-1. 계산 기하 (2)

**문제를 풀기 전에 공부하기**: 로테이팅 캘리퍼스, 포인트 인 폴리곤 테스트

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 4181 | B - Convex Hull | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/17.svg) | [문제 링크](https://www.acmicpc.net/problem/4181) |
| 9240 | C – 로버트 후드 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/18.svg) | [문제 링크](https://www.acmicpc.net/problem/9240) |
| 13310 | D – 먼 별 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/21.svg) | [문제 링크](https://www.acmicpc.net/problem/13310) |
| 1688 | E – 지민이의 테러 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/17.svg) | [문제 링크](https://www.acmicpc.net/problem/1688) |

### ?-2. 문자열 (2)

**문제를 풀기 전에 공부하기**: LCP 배열, 아호-코라식 알고리즘

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 5670 | A – 휴대폰 자판 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/17.svg) | [문제 링크](https://www.acmicpc.net/problem/5670) |
| 9248 | B - Suffix Array | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/18.svg) | [문제 링크](https://www.acmicpc.net/problem/9248) |
| 9250 | C - 문자열 집합 판별 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/19.svg) | [문제 링크](https://www.acmicpc.net/problem/9250) |
| 1701 | D – Cubeditor | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/14.svg) | [문제 링크](https://www.acmicpc.net/problem/1701) |

### X-1. DFS 스패닝 트리의 활용 (2)

**문제를 풀기 전에 공부하기**: 2-SAT

**학습 유의사항**: X

| 문제 번호 | 문제 | 티어 | 링크 |
|------|------|------|------|
| 3682 | A – 동치 증명 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/18.svg) | [문제 링크](https://www.acmicpc.net/problem/3682) |
| 4013 | B – ATM | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/19.svg) | [문제 링크](https://www.acmicpc.net/problem/4013) |
| 11280 | C – 2-SAT – 3 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/17.svg) | [문제 링크](https://www.acmicpc.net/problem/11280) |
| 11281 | C* - 2-SAT – 4 | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/18.svg) | [문제 링크](https://www.acmicpc.net/problem/11281) |
| 16367 | D – TV Show Game | ![Tier](https://d2gd6pc034wcta.cloudfront.net/tier/19.svg) | [문제 링크](https://www.acmicpc.net/problem/16367) |

