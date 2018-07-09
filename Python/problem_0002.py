first_term = 1
second_term = 2
limit = 4_000_000
sum = 0

while second_term < limit:
    if second_term % 2 == 0:
        sum += second_term
    next_term = first_term + second_term
    first_term = second_term
    second_term = next_term

print(sum)