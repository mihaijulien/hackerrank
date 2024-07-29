len :: [a] -> Int
len [] = 0
len [x] = 1
len (x:xs) = 1 + len xs 
