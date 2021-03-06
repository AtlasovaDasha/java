<h2 id="описание">Задача: Калькулятор<a class="anchorjs-link " href="#описание" aria-label="Anchor" data-anchorjs-icon="" style="font: 1em / 1 anchorjs-icons; padding-left: 0.375em;"></a></h2>

<h2 id="описание">Описание:<a class="anchorjs-link " href="#описание" aria-label="Anchor" data-anchorjs-icon="" style="font: 1em / 1 anchorjs-icons; padding-left: 0.375em;"></a></h2>
<p>Создай консольное приложение “Калькулятор”.
Приложение должно читать из консоли введенные пользователем арифметические операции и выводить в консоль результат их выполнения.</p>

<h2 id="требования">Требования:<a class="anchorjs-link " href="#требования" aria-label="Anchor" data-anchorjs-icon="" style="font: 1em / 1 anchorjs-icons; padding-left: 0.375em;"></a></h2>

<ol>
  <li>Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами:
a + b, a - b, a * b, a / b.  <b> Данные передаются в одну строку (смотри пример)! Решения, в которых каждое число и арифмитеческая операция передаются с новой строки считаются неверными. </b></li>
  <li>Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.</li>
  <li>Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.</li>
  <li>Калькулятор умеет работать только с целыми числами.</li>
  <li>Калькулятор умеет работать только с арабскими или римскими  цифрами одновременно, при вводе пользователем строки вроде 3 + II калькулятор должен выбросить исключение и прекратить свою работу.</li>
  <li>При вводе римских чисел, ответ должен быть выведен римскими цифрами, соответственно, при вводе арабских - ответ ожидается арабскими.</li>
  <li>При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.</li>
  <li>При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, приложение выбрасывает исключение и завершает свою работу.</li>
  <li>Результатом операции деления является целое число, остаток отбрасывается.&nbsp;</li>
  <li>Результатом работы калькулятора&nbsp;с арабскими числами могут быть отрицательные числа и ноль. Результатом работы калькулятора с римскими числами могут быть только положительные числа, если результат работы меньше единицы, выбрасывается исключение</li>
</ol>

<h2 id="пример-работы-программы">Пример работы программы:<a class="anchorjs-link " href="#пример-работы-программы" aria-label="Anchor" data-anchorjs-icon="" style="font: 1em / 1 anchorjs-icons; padding-left: 0.375em;"></a></h2>
<h6 id="input">Input:<a class="anchorjs-link " href="#input" aria-label="Anchor" data-anchorjs-icon="" style="font: 1em / 1 anchorjs-icons; padding-left: 0.375em;"></a></h6>
<p><code class="language-plaintext highlighter-rouge">1 + 2</code></p>
<h6 id="output">Output:<a class="anchorjs-link " href="#output" aria-label="Anchor" data-anchorjs-icon="" style="font: 1em / 1 anchorjs-icons; padding-left: 0.375em;"></a></h6>
<p><code class="language-plaintext highlighter-rouge">3</code></p>
<h6 id="input-1">Input:<a class="anchorjs-link " href="#input-1" aria-label="Anchor" data-anchorjs-icon="" style="font: 1em / 1 anchorjs-icons; padding-left: 0.375em;"></a></h6>
<p><code class="language-plaintext highlighter-rouge">VI / III</code></p>
<h6 id="output-1">Output:<a class="anchorjs-link " href="#output-1" aria-label="Anchor" data-anchorjs-icon="" style="font: 1em / 1 anchorjs-icons; padding-left: 0.375em;"></a></h6>
<p><code class="language-plaintext highlighter-rouge">II</code></p>
<h6 id="input-2">Input:<a class="anchorjs-link " href="#input-2" aria-label="Anchor" data-anchorjs-icon="" style="font: 1em / 1 anchorjs-icons; padding-left: 0.375em;"></a></h6>
<p><code class="language-plaintext highlighter-rouge">I -&nbsp;II</code></p>
<h6 id="output-2">Output:<a class="anchorjs-link " href="#output-2" aria-label="Anchor" data-anchorjs-icon="" style="font: 1em / 1 anchorjs-icons; padding-left: 0.375em;"></a></h6>
<p><code class="language-plaintext highlighter-rouge">throws Exception //т.к. в римской системе нет отрицательных чисел</code></p>
<h6 id="input-3">Input:<a class="anchorjs-link " href="#input-3" aria-label="Anchor" data-anchorjs-icon="" style="font: 1em / 1 anchorjs-icons; padding-left: 0.375em;"></a></h6>
<p><code class="language-plaintext highlighter-rouge">I + 1</code></p>
<h6 id="output-3">Output:<a class="anchorjs-link " href="#output-3" aria-label="Anchor" data-anchorjs-icon="" style="font: 1em / 1 anchorjs-icons; padding-left: 0.375em;"></a></h6>
<p><code class="language-plaintext highlighter-rouge">throws Exception //т.к. используются одновременно разные системы счисления </code></p>
<h6 id="input-4">Input:<a class="anchorjs-link " href="#input-4" aria-label="Anchor" data-anchorjs-icon="" style="font: 1em / 1 anchorjs-icons; padding-left: 0.375em;"></a></h6>
<p><code class="language-plaintext highlighter-rouge">1</code></p>
<h6 id="output-4">Output:<a class="anchorjs-link " href="#output-4" aria-label="Anchor" data-anchorjs-icon="" style="font: 1em / 1 anchorjs-icons; padding-left: 0.375em;"></a></h6>
<p><code class="language-plaintext highlighter-rouge">throws Exception //т.к. строка не является математической операцией </code></p>
<h6 id="input-5">Input:<a class="anchorjs-link " href="#input-5" aria-label="Anchor" data-anchorjs-icon="" style="font: 1em / 1 anchorjs-icons; padding-left: 0.375em;"></a></h6>
<p><code class="language-plaintext highlighter-rouge">1 + 2 + 3</code></p>
<h6 id="output-5">Output:<a class="anchorjs-link " href="#output-5" aria-label="Anchor" data-anchorjs-icon="" style="font: 1em / 1 anchorjs-icons; padding-left: 0.375em;"></a></h6>
<p><code class="language-plaintext highlighter-rouge">throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *) </code></p>
