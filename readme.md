# Porker Hands モブプロ(Scala)

Porker Handsの説明を読み用意しているテストの全てのケースを成功させてください。

## 実行方法

テストを実行
```
./sbtx test
```

## Porker Handsの説明
ポーカーのデッキには52枚のカードが入っており、各カードにはクラブ、ダイヤ、ハート、スペードのいずれかのスーツがあります（入力データではC、D、H、Sと表記）。

また、各カードには、2、3、4、5、6、7、8、9、10、ジャック、クイーン、キング、エースのいずれかの価値があります（2、3、4、5、6、7、8、9、T、J、Q、K、Aと表記）。

得点のためには、スーツは順不同で、値は上述のように順に並べられ、2が最も低く、エースが最も高い値となります。

ポーカーハンドは、デッキから配られた5枚のカードで構成されます。ポーカーの手役は、次のように低いものから高いものの順にランク付けされます。

ハイカード
それ以上のカテゴリーに当てはまらないハンドは、一番高いカードの価値でランク付けされます。一番高いカードの値が同じ場合は、次に高いカードの値でランク付けされます。

ワンペア
手札の5枚のカードのうち2枚が同じ値であること。ペアを含む手札は、ペアを構成するカードの価値でランク付けされます。これらの値が同じであれば、ペアになっていないカードの値の小さい順にランク付けされます。

ツーペア
ハンドには2つの異なるペアが含まれています。2つのペアを含むハンドは、最も高いペアの値でランク付けされます。同じペアを持つ手は、もう一方のペアの値でランク付けされます。これらの値が同じ場合、手は残りのカードの値でランク付けされます。

スリーカード
手持ちのカードのうち3枚が同じ値であること。スリーカードを含むハンドは、その3枚のカードの価値でランク付けされます。

ストレート
手札に連続した値のカードが5枚含まれている。ストレートを含むハンドは、最も高いカードでランク付けされる。

フラッシュ
手札に同じスートのカードが5枚含まれている。両方ともフラッシュのハンドは、ハイカードのルールでランク付けされます。

フルハウス
同じ数字の3枚のカードと残りの2枚のカードがペアになっている状態。3枚のカードの価値でランク付けされます。

フォーカード
同じ数字のカードが4枚ある状態。4枚のカードの価値が高い順に並べる。

ストレートフラッシュ
同じスーツの5枚のカードを連続した値で揃える。手持ちのカードの中で一番高いカードで順位を決める。

あなたの仕事は、ペアのポーカーハンドをランク付けし、どちらかが上位であれば、どちらが上位かを示すことです。

例:  
Input: Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH
Output: White wins - high card: Ace

Input: Black: 2H 4S 4C 2D 4H White: 2S 8S AS QS 3S
Output: Black wins - full house

Input: Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C KH
Output: Black wins - high card: 9

Input: Black: 2H 3D 5S 9C KD White: 2D 3H 5C 9S KH
Output: Tie
