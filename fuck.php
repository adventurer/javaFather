<?php
$a=0;
$s = function($v) use (&$a){
    $a+=$v;
};

$sum = function (...$nums) use ($s,&$sum){
    foreach ($nums as $v) {
        $s($v);
    }
    return $sum;
};

$sum(3,4)(3)(4)(3,1);
echo $a;
