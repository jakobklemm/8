def genEight(n:Int, l:Int):Int = {
    if (n >= l) {
		return (8)
	}
    return (series(n, l) / (123456700+(genEight(n+1, l)*10)+9))
}
def series(n:Int, l:Int):Int = {
    if (n >= l) {
		return (987654321)
	}
	return ((123456700+ (genEight(n + 1, l) * 10) + 9) * genEight(n + 1, l) + 9)
}
def main(i:Int) = {
    val t1 = System.nanoTime
    println(genEight(1, i))
    val duration = (System.nanoTime - t1) / 1e9d
    println(i + ": " + duration + "s")
    println(" - - - - - - ")
}

for (i <- 1 to 50) main(i)