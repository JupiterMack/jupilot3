package com.traversymedia.jupilot3

object LCexercises:
    def main(args: Array[String]): Unit =
        def combinationSum(candidates: Array[Int], target: Int):List[List[Int]] =
            def combinationSum(candidates: Array[Int], target: Int, index: Int):List[List[Int]] =
                if target == 0 then List(Nil)
                else if target < 0 || index == candidates.length then Nil
                else
                    val candidate = candidates(index)
                    val withCandidate = combinationSum(candidates, target - candidate, index)
                    val withoutCandidate = combinationSum(candidates, target, index + 1)
                    withCandidate.map(candidate :: _) ++ withoutCandidate
            combinationSum(candidates, target, 0)
       
            
        println(cominationSum(Array(2,3,6,7), 7))
