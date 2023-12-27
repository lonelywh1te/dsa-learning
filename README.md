# Оглавление
- [Оглавление](#оглавление)
- [Асимптотическая сложность. О-нотация](#асимптотическая-сложность-о-нотация)
  - [Понятие асимптотической сложности](#понятие-асимптотической-сложности)
  - [Big-O нотация](#big-o-нотация)
  - [Остальные нотации (Ω, Θ)](#остальные-нотации-ω-θ)
    - [Ω (Омега)](#ω-омега)
    - [Θ (Тета)](#θ-тета)
  - [Анализ сложности алгоритмов](#анализ-сложности-алгоритмов)
  - [Худший, средний и лучший случай](#худший-средний-и-лучший-случай)
- [Массивы](#массивы)
  - [Определение, характеристики](#определение-характеристики)
  - [Индексация](#индексация)
  - [Двумерные массивы](#двумерные-массивы)
# Асимптотическая сложность. О-нотация
## Понятие асимптотической сложности

> *Асимптотическая сложность - это концепция в теории вычислительной сложности, которая описывает поведение алгоритма при увеличении размера входных данных. Она позволяет нам сравнивать эффективность различных алгоритмов независимо от конкретных значений входных данных.*

В общем виде, асимптотическая сложность алгоритма определяется как функция, которая описывает количество операций, которые должен выполнить алгоритм, в зависимости от размера входных данных. Эта функция обычно обозначается как O(n), где n - это размер входных данных.  

Асимптотическая сложность может быть выражена в терминах больших O, Ω (Омега) и Θ (Тета). Большие O используются для верхней границы сложности, Ω - для нижней границы, а Θ - когда верхняя и нижняя границы совпадают.

Например, если мы говорим, что алгоритм имеет асимптотическую сложность O(n^2), это означает, что время выполнения алгоритма будет расти **квадратично** с увеличением размера входных данных. Если же мы говорим, что алгоритм имеет асимптотическую сложность O(log n), это означает, что время выполнения алгоритма будет расти **логарифмически** с увеличением размера входных данных.

[Изучить подробнее](https://www.geeksforgeeks.org/types-of-asymptotic-notations-in-complexity-analysis-of-algorithms/)

## Big-O нотация
![Big-O Complexity](images/big-o-complexity.png)
> *Big-O нотация представляет собой математическое выражение, описывающее ограничение сверху скорости роста функции, которая определяет количество операций, выполняемых алгоритмом*

Основная цель Big-O нотации - предоставить инструмент для сравнения эффективности различных алгоритмов. Это позволяет программистам выбирать наиболее эффективный алгоритм для конкретной задачи, учитывая объем данных, с которыми он будет работать.

Вот некоторые общие типы временной сложности и соответствующие им Big O нотации:

- **O(1)**: Константная временная сложность. Это наилучший случай, когда время выполнения алгоритма не зависит от размера входных данных. Примером может служить доступ к элементу массива по индексу.

- **O(log n)**: Логарифмическая временная сложность. Это хорошо, когда размер входных данных уменьшается вдвое с каждым шагом, например, при бинарном поиске.

- **O(n)**: Линейная временная сложность. Это происходит, когда вы имеете один цикл в вашем алгоритме. Примером может служить простой перебор всех элементов массива.

- **O(n log n)**: Временная сложность, которую можно найти в алгоритмах сортировки, таких как сортировка слиянием и быстрая сортировка.

- **O(n^2)**: Квадратичная временная сложность. Это происходит, когда у вас есть вложенные циклы в вашем алгоритме. Примером может служить алгоритм пузырьковой сортировки.

- **O(2^n)**: Экспоненциальная временная сложность. Это происходит, когда время выполнения алгоритма удваивается с каждым новым элементом входных данных. Примером может служить алгоритм перебора подмножеств.
  
Важно помнить, что эти нотации описывают только верхнюю границу времени выполнения алгоритма, то есть максимальное возможное время выполнения.

[Изучить подробнее](https://www.geeksforgeeks.org/analysis-algorithms-big-o-analysis/)

## Остальные нотации (Ω, Θ)
### Ω (Омега)
> *Нотация Ω определяет **нижнюю** границу роста времени выполнения алгоритма.* 

Это указывает на минимальное количество операций, которое алгоритм должен выполнить при заданных размерах входных данных.

- **Оценка лучшего случая**: Нотация Ω дает представление о минимальном времени выполнения алгоритма при данном размере входных данных.

- **Пример**: Если алгоритм имеет время выполнения Ω(n), это означает, что как минимум n операций будут выполнены для входных данных размера n.

[Изучить подробнее](https://www.geeksforgeeks.org/analysis-of-algorithms-big-omega-notation)

### Θ (Тета)
> *Нотация Θ обозначает **среднюю** оценку времени выполнения алгоритма, определяя как нижнюю, так и верхнюю границы его выполнения.*

- **Оценка лучшего случая**: Нотация Θ указывает, что алгоритм выполняется "примерно столько же, сколько и Ω, но не более, чем O.

- **Пример**: Если время выполнения алгоритма оценивается как Θ(n), это означает, что алгоритм выполняется примерно за линейное время, в пределах заданных размеров входных данных.
  
[Изучить подробнее](https://www.geeksforgeeks.org/analysis-of-algorithms-big-theta-notation)

## Анализ сложности алгоритмов
Определение сложности алгоритма связано с определением количества операций или ресурсов (например, время или память), которые требуются для выполнения этого алгоритма в зависимости от размера входных данных.  

Расчет сложности алгоритма обычно включает в себя следующие шаги:  
1. Определение операций  
   
   Определить базовые операции, которые выполняются в алгоритме. Это может быть простая математическая операция, сравнение, присваивание значения или что-то другое  

**Пример**: Рассмотрим алгоритм поиска максимального элемента в массиве.
```kotlin
fun findMax(arr: IntArray): Int {
    var max = arr[0]       // Присваивание значения - O(1)
    for (value in arr) {    // Цикл - O(n)
        if (value > max) {  // Сравнение - O(1)
            max = value     // Присваивание значения - O(1)
        }
    }
    return max
}
```
2. Оценка  
   
   Проанализировать, сколько раз каждая базовая операция выполняется в зависимости от размера входных данных. Это включает в себя анализ циклов, рекурсивных вызовов или других структур данных в алгоритме.

**Пример**: В предыдущем алгоритме поиска максимального элемента:
- Присваивание начального значения - 1 операция
- Цикл, проходящий по массиву - n операций
  - Сравнение и, при необходимости, присваивание нового значения - по 1 операции

**Расчёт**: O(1 + n * (1 + 1)) = O(1 + 2n) = O(2n) = **O(n)**  

Расчет показывает, что время выполнения данного алгоритма оценивается как O(n), что указывает на линейную зависимость времени выполнения от размера входных данных

[Изучить подробнее](https://www.geeksforgeeks.org/examples-of-big-o-analysis)

## Худший, средний и лучший случай
> *Худший случай (Worst Case) - это сценарий выполнения алгоритма, который приводит к наибольшему времени выполнения или использованию ресурсов из всех возможных входных данных.*

Это наихудший из всех возможных сценариев, когда алгоритм работает медленнее всего или требует наибольшего количества операций.

В большинстве случаев мы проводим анализ наихудших сценариев для анализа алгоритмов. В худшем анализе мы гарантируем верхнюю границу времени работы алгоритма, что является хорошей информацией.

> *Средний случай (Average Case) - это сценарий выполнения алгоритма, который учитывает типичные или средние входные данные и время выполнения в среднем по всем возможным входам.* 

Это усредненная оценка производительности алгоритма по всем возможным входам

В большинстве практических случаев анализ усредненного случая сделать непросто, и он редко проводится. При анализе среднего случая мы должны знать (или предсказывать) математическое распределение всех возможных входных данных.

> *Лучший случай (Best Case) - это сценарий выполнения алгоритма, при котором он достигает наименьшего времени выполнения или использует наименьшее количество ресурсов из всех возможных входных данных.* 

Это оптимальный сценарий, когда алгоритм работает быстрее всего или требует наименьшего количества операций.

Анализ лучшего является фальшивым. Гарантия нижней границы алгоритма не дает никакой информации, так как в худшем случае на выполнение алгоритма могут уйти годы.

**Пример**: Линейный поиск  

- Лучший случай: Лучший случай для линейного поиска наступает, когда искомый элемент находится в начале массива или первым элементом. В этом случае алгоритм совершает всего одно сравнение и заканчивает выполнение, что занимает время O(1).
  
- Худший случай: Худший случай для линейного поиска наступает, когда искомый элемент находится в самом конце массива или отсутствует в массиве. В этом случае алгоритм перебирает все элементы в массиве и выполняет n сравнений (где n - количество элементов), что занимает время O(n).

[Изучить подробнее](https://www.geeksforgeeks.org/worst-average-and-best-case-analysis-of-algorithms)

# Массивы
## Определение, характеристики
![Array example](images/array.png)  

> *Массив в программировании представляет собой структуру данных, которая хранит элементы одного типа, располагая их последовательно в памяти компьютера.*

Элементы в массиве доступны по их индексам, что облегчает управление данными и обращение к ним.  

Основные характеристики массивов:  
- **Тип данных**: Все элементы массива имеют одинаковый тип данных. Например, массив целых чисел, массив строк, массивы с плавающей точкой и т.д.

- **Индексация**: Элементы в массиве нумеруются начиная с 0 (в случае многих языков программирования). Индекс используется для доступа к элементу в массиве.

- **Фиксированный размер**: Размер массива обычно определяется при его создании и остаётся **неизменным** во время выполнения программы (в некоторых языках есть динамические массивы, которые могут менять размер в процессе работы программы).

- **Эффективность доступа**: Использование индексов позволяет быстро получать доступ к элементам массива. Это делает операции чтения и записи очень эффективными.

[Изучить подробнее](https://www.geeksforgeeks.org/what-is-array/)

## Индексация
> *Индексация в массивах - это способ обращения к отдельным элементам массива по их порядковому номеру или индексу.*

Индексы начинаются с 0 во многих языках программирования. Например, первый элемент массива будет иметь индекс 0, второй - индекс 1 и так далее.  

Индексация позволяет получать доступ к элементам массива и изменять их значения. Она является ключевым аспектом работы с массивами.

Пример: 
```kotlin
val names = arrayOf("Max", "John", "Mike") // Массив с именами
println(arr[0]) // Вывод: Max
println(arr[2]) // Вывод: Mike

names[2] = "Bob" // Изменение значения массива

println(arr[2]) // Вывод: Bob
```

Индексация дает возможность эффективно работать с элементами массива. Она обеспечивает простой доступ к данным и позволяет выполнять различные операции, такие как чтение, запись, удаление и обновление элементов массива.

> Временная сложность индексации в массиве обычно составляет **O(1)**.  
> Это означает, что время доступа к любому элементу в массиве не зависит от размера массива.

[Изучить подробнее](https://www.geeksforgeeks.org/how-exactly-does-indexing-works-in-arrays)

## Двумерные массивы
> *Двумерные массивы - это массивы, которые имеют два измерения: строки и столбцы.*

Индексация в двумерных массивах происходит с использованием двух чисел: первое число обозначает строку, а второе - столбец. Индексы также часто начинаются с нуля.

Пример двумерного массива:
```kotlin
fun main() {
    // Создание двумерного массива
    val 2d_arr = arrayOf(
        intArrayOf(1, 2, 3), // 0
        intArrayOf(4, 5, 6), // 1
        intArrayOf(7, 8, 9) // 2
    )

    // Доступ к элементам массива по индексам
    println(2d_arr[0][0])  // Вывод: 1
    println(2d_arr[1][2])  // Вывод: 6
    println(2d_arr[2][1])  // Вывод: 8
}
```

Индексация в n-мерных массивах работает аналогично, где каждое новое измерение добавляет еще один индекс для доступа к элементу в соответствующей размерности.

[Изучить подробнее](https://www.geeksforgeeks.org/difference-between-one-dimensional-and-two-dimensional-array)