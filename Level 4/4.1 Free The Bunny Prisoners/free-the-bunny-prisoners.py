from itertools import combinations


def solution(num_buns, num_required):
    bunny_keyrings = [[] for num in range(num_buns)]
    n_key_per_bunny = num_buns - num_required + 1
    for keynum, keyholders in enumerate(combinations(range(num_buns), n_key_per_bunny)):
        for index in keyholders:
            bunny_keyrings[index].append(keynum)

    return bunny_keyrings
