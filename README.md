
Decorator desenini; bir interface’de imzası tanımlanmış herhangi bir metodun işlevini genişletebilmek için ilgili interface’i implement eden bir sınıf olarak tanımlayabiliriz. Decorator deseni, bir nesneye dinamik olarak yeni özellikler eklemek için kullanılır. Mevcut sınıfa bir sarmalayıcı sağlayan yapısal bir desendir. Sarmalayıcıyı uygulamak için composition ile birlikte abstract class veya interface’leri  kullanır.

Bu uygulamada, decorator tasarım deseni kullanılarak X bankasından, emekli aylığını alan bir kişinin aylık ödemesi gerçekleştirilir.

Senaryo:
Emekli aylığını X bankasından alan bir kişiye belirli kriterleri sağladığı taktirde, belirli zamanlarda banka tarafından promosyon ödemesi yapılmaya karar verilmiştir.
Promosyon ödemesi aşağıdaki durumlarda yapılır:
1-) Emekli aylığını X bankasına taşıyan emekliye, ilk aylığında 500TL ödeme.
2-) Emekli aylığını bir yıldır X bankasından alan emeklinin her yıldönümünde  1500TL ödeme.

UML Diyagram:

Pension interface’ini implement eden PensionImlp sınıfındaki pay() methodu bankanın emekliye yaptığı maaş ödemesini gerçekleştirir.  
FirstMonthPromotion dekoratöründeki getFirstMonthPromotion() methodu senaryoda ki birinci durumu, AnnualPromotion dekoratöründeki AnnualPromotion() methodu senaryoda ki ikinci durumu gerçekleştirir.

![image](https://user-images.githubusercontent.com/16039532/147858998-51b21b3f-efda-4638-860b-ec35e9a128e9.png)



