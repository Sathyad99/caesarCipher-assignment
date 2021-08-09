object CaesarCipher {

def main(args:Array[String]) {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  val encrypt=(c:Char, key:Int, a:String) => a((a.indexOf(c.toUpper)+key)%a.size);

  val decrypt=(c:Char, key:Int, a:String) => a((a.indexOf(c.toUpper)-key)%a.size);

  val cipher=(algo:(Char,Int,String) =>Char, s:String, key:Int, a:String) => s.map(algo(_,key,a));

  val ct=cipher(encrypt,"catalogue",5,alphabet);
  println(ct);

  val pt=cipher(decrypt,ct,5,alphabet);
  println(pt);
}

}
