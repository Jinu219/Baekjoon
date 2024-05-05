import sys
input = sys.stdin.readline

while (k:=input().rstrip()):
    a, b = map(int, k.split())
    print(a+b)