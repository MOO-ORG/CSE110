# **Tracing – Tracing3.java**

## **Tracing3 Class**

```java
public class Tracing3 {
  public static void main(String[] args) {
        int p = 5;
        int q = 6;
        int r = 9;
        int sum = 0;
        if (p < 12) {
                  System.out.println(r + 2);
        }
        else {
                  System.out.println(r + p);
        }
        if (q > 20){
              System.out.println(r + 19);
        }
        else if (q <= 6) {
                  System.out.println(q + 3);
        }
        else{
                  System.out.println(p + q + r);
        }
        if (r > 15) {
                  System.out.println(r);
        }
        else if (r == 0) {
                  System.out.println(p + q);
        }
        else {
                  System.out.println(p);
        }
        if (sum != 0) {
                  System.out.println(3);
        }
        else {
                  System.out.println(sum + 32);
        }
        if(p > 0 && r < 10){
                  System.out.println(p + r);
        }
        else {
                  System.out.println(p - r);
        }
  }
}
```

---

## **Main Method Execution**

### Step 1: Variable Initialization
```java
int p = 5;
int q = 6;
int r = 9;
int sum = 0;
```
- `p = 5`  
- `q = 6`  
- `r = 9`  
- `sum = 0`  

---

### Step 2: First if–else
```java
if (p < 12) {
    System.out.println(r + 2);
} else {
    System.out.println(r + p);
}
```
- Condition: `p < 12` → `5 < 12` → **true**  
- Executes first branch  
  → `System.out.println(r + 2)` → `9 + 2 = 11`

**Output:** `11`

---

### Step 3: Second if–else chain
```java
if (q > 20) {
    System.out.println(r + 19);
}
else if (q <= 6) {
    System.out.println(q + 3);
}
else {
    System.out.println(p + q + r);
}
```
- Check `q > 20` → `6 > 20` → **false**  
- Check `q <= 6` → `6 <= 6` → **true**  
- Executes `System.out.println(q + 3)` → `6 + 3 = 9`

**Output:** `9`

---

### Step 4: Third if–else chain
```java
if (r > 15) {
    System.out.println(r);
}
else if (r == 0) {
    System.out.println(p + q);
}
else {
    System.out.println(p);
}
```
- `r > 15` → `9 > 15` → **false**  
- `r == 0` → `9 == 0` → **false**  
- Else executes → `System.out.println(p)` → `5`

**Output:** `5`

---

### Step 5: Fourth if–else
```java
if (sum != 0) {
    System.out.println(3);
}
else {
    System.out.println(sum + 32);
}
```
- `sum != 0` → `0 != 0` → **false**  
- Executes else branch → `System.out.println(sum + 32)` → `0 + 32 = 32`

**Output:** `32`

---

### Step 6: Fifth if–else
```java
if (p > 0 && r < 10) {
    System.out.println(p + r);
}
else {
    System.out.println(p - r);
}
```
- `p > 0` → `5 > 0` → **true**  
- `r < 10` → `9 < 10` → **true**  
- Combined → **true && true = true**  
- Executes first branch → `System.out.println(p + r)` → `5 + 9 = 14`

**Output:** `14`

---

## **Final Output Sequence**
```
11
9
5
32
14
```

---

## **Final State Summary**
| Variable | Final Value |
|-----------|--------------|
| p         | 5 |
| q         | 6 |
| r         | 9 |
| sum       | 0 |

---

✅ **Program Output (in order):**
```
11
9
5
32
14
```
