import React, { useState } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count + 1);
  };

  const sayHello = () => {
    alert("Hello! Member1");
  };

  const handleIncrement = () => {
    increment();
    sayHello();
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const welcome = (msg) => {
    alert(msg);
  };

  const onPress = () => {
    alert("I was clicked");
  };

  return (
    <div style={{ margin: "20px" }}>
      <h3>{count}</h3>

      <button onClick={handleIncrement}>Increment</button>
      <br />

      <button onClick={decrement}>Decrement</button>
      <br />

      <button onClick={() => welcome("welcome")}>
        Say Welcome
      </button>
      <br />

      <button onClick={onPress}>Click on me</button>

      <br />
      <br />

      <CurrencyConvertor />
    </div>
  );
}

export default App;