fun main(){
    // Call 1
    var list=names(listOf("Angel","Kalisa","Human","Anne","Tita","Zikamwa","Wuanita","Mathai","Wilson","Gikundiro"))
    println(list)


    // Call 2
    var wanted=height(listOf(8.2,13.5,41.7,6.6))
    println(wanted)


    // Call 3
    var Gahigi=People("Gahigi",50,10.0,90.0)
    var Rose=People("Rose",40,7.3,80.7)
    var Natete=People("Natete",23,3.9,20.3)
    var People= listOf(Gahigi,Rose,Natete)
    var people=People.sortedByDescending { person -> person.age }
    println(people)


    // Call 4
    var Angel=Kids("Angel",50,10.0,90.0)
    var Roza=Kids("Roza",40,7.3,80.7)
    var Kayitete=Kids("Kayitete",23,3.9,20.3)
    var Kids= listOf(Angel,Roza,Kayitete)
    var kids=Kids.sortedByDescending { kid-> kid.age }
    println(kids)

    var Ganza=Kids("Ganza",4,1.0,20.8)
    var Annet=Kids("Annet",17,7.0,36.0)
    var new= mutableListOf(Ganza,Annet)
    println(new.plus(Kids))


    // Call 5
    var prado=Car("kat4678",60.78)
    var toyota=Car("kcx5689",45.44)
    var nissan=Car("kdx34ff6",68.22)
    var cars= listOf(prado,toyota,nissan)
    println(carMileageAv(cars))
}



// Number 1

fun names(name:List<String>):List<String> {
    var even = mutableListOf<String>()
    name.forEachIndexed { index, item ->
        if (index % 2 == 0) {
            even.add(item)
        }

    }
    return even
}

// Number 2
fun height(x:List<Double>):String{
    var total=x.sum()
    var average=x.average()
    var record="$total,$average"
    return record
}
// Number 3
data class People(var name:String,var age:Int, var height:Double,var weight:Double)
// Number 4( a function similar to function 3)
data class Kids(var name:String,var age:Int, var height:Double,var weight:Double)



data class Car(var registration:String,var mileage:Double)
fun carMileageAv(car: List<Car>):Double{
    var sum=0.0
    car.forEach { caar->
        sum+=caar.mileage
    }
    return sum/car.count()
    }

