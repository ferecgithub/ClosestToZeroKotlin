

fun main() {
    var listOfTemp = arrayListOf<Double>(7.0, -10.0, 13.0, 9.0, 4.0, -7.2, -12.0, -3.7, 3.5, -9.6, 6.5, -1.7, -6.2, 7.0)
    println(closestToZero(listOfTemp))
}


/**
 *  1- The list from parameter sorted and assigned to a temporary list
 *  2- Scanned through the list to first the first element that is equal or bigger than 0
 *  3- Compared the absolute value of both indices i and i-1 to find the lesser difference
 */

fun closestToZero(listOfTemperatures: ArrayList<Double>): Double {
    var tempList= listOfTemperatures.sorted()
    var valClosestToZero = 0.0
    for(i in tempList.indices) {
        if(tempList[i] == 0.0) {
            valClosestToZero = tempList[i]
        }
        if(tempList[i] > 0) {
            if(tempList[i].compareTo(tempList[i-1].unaryPlus()) == -1) {
                valClosestToZero = tempList[i]
                break
            } else if(tempList[i].compareTo(tempList[i-1].unaryPlus()) == 1) {
                valClosestToZero = tempList[i-1]
                break
            } else {
                valClosestToZero = tempList[i]
                break
            }
        }
    }
    return valClosestToZero
}