rec :: [Int] -> [Int]
rev lst = foldr (\x -> (++[x])) [] lst
