# 실전 문제 | 왕실의 나이트
# 시간 제한 1초 | 메모리 제한 128MB

h = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h']
dx = [-2, -2, -1, -1, 2, 2, 1, 1]
dy = [-1, 1, -2, 2, -1, 1, -2, 2]

str = input()
x = h.index(str[0]) + 1
y = int(str[1])
count = 0

for i in range(len(dx)):
    move_x = dx[i] + x
    move_y = dy[i] + y
    if 1 <= move_x <= 8 and 1 <= move_y <= 8:
        count += 1

print(count)
# 문제 풀이 시간  || 19분 23초

