/*
 *
 * Dia 5 parte 2
 * String's nice:
 * 1.- contiene un par de letras que se repite
 * 2.- contiene una letra que se repite con una letra entre ellas
 *
 */

def example1 = "qjhvhtzxzqqjkmpb" //nice
def example2 = "xxyxx" //nice
def example3 = "uurcxstgmygtbstg" //naughty
def example4 = "ieodomkazucvgmuy" //naughty

def isNice(String string){
	//propertie1(string) && propertie2(string)
}

def propertie1(String st){
	def flag = false
	for (int i = 0; i < st.length()-1; i++)
		for (int j = 1; j < st.length(); j++)
			if (( st.split("qj", -1).length ) - 1 >= 2)
				flag = true
	flag
}

def propertie2(String st){

}
//st.charAt(i)+st.charAt(j)
def count = ( example1.split("Java", -1).length ) - 1
println count
//println propertie1(example1)

def f = new File("input")
def total = 0
f.eachLine() {
	line -> 
	if(isNice(line)) total++
}