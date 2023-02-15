# 실전 문제 | 1이 될 때까지
# 시간 제한 1초 | 메모리 제한 128MB
n, k = map(int, input().split())

count = 0
while n != 1:
    if n % k == 0:
        n /= k
    else:
        n -= 1
    count += 1

print(count)
# 문제 풀이 시간  || 6분 26초
# 시간 측정 결과  || 0.0초(입력시간 제외)
