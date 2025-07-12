# JSX

## JSX Elements

- A basic unit of JSX is called a JSX element.

```html
<h1>Hello world</h1>
```

- It looks like HTML, but in a javascript file.
- JSX elements are treated as Javascript expression. It can be saved in a variable, passed to a function, stored in array etc.

```js
const myTeam = {
  center: <li>Benzo Walli</li>,
  powerForward: <li>Rasha Loa</li>,
  smallForward: <li>Tayshaun Dasmoto</li>,
  shootingGuard: <li>Colmar Cumberbatch</li>,
  pointGuard: <li>Femi Billon</li>
};

```

## Attributes in JSX

- JSX elements can have attributes, just like HTML.

```js
const title = <h1 id='title'>Introduction to React.js: Part I</h1>;
const panda = <img src='images/panda.jpg' alt='panda' width='500px' height='500px'>;
```

```js
const p1 = <p id="large">foo</p>;
const p2 = <p id="small">bar</p>;
```


## Nested JSX

- You can nest JSX elements inside of other JSX elements, just like in HTML.

```html
<a href="https://www.example.com"><h1>Click me!</h1></a>
```

```js
 const theExample = (
   <a href="https://www.example.com">
     <h1>
       Click me!
     </h1>
   </a>
 );

```