module Main where


gcd' :: Integral a => a -> a -> a
gcd' n m 
    | n == m = n
    | otherwise = gcd (n-m) m
