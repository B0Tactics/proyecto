

var blob;

var blobs = [];
var zoom = 1;


console.log(windowWidth,windowHeight);

function setup() {
  createCanvas(windowWidth-20, windowHeight-20);
  blob = new Blob(0, 0, 64);
  for (var i = 0; i < 100; i++) {
    var x = random(-width,width);
    var y = random(-height,height);
    blobs[i] = new Blob(x, y, 16);
  }
  //velocidad del juego
  frameRate(100);
}

//responsive magia :V
function windowResized() {
  resizeCanvas(windowWidth, windowHeight);
}

function draw() {
  background(0);
  translate(width/2, height/2);
  var newzoom = 40 / blob.r;
  zoom = lerp(zoom, newzoom, 0.1);
  scale(zoom);
  translate(-blob.pos.x, -blob.pos.y);

  for (var i = blobs.length-1; i >=0; i--) {
    blobs[i].show();
    if (blob.eats(blobs[i])) {
      //borra el punto que come
      blobs.splice(i, 1);
      //redibuja uno aleatorio
      var x = random(-width,width);
      var y = random(-height,height);
      blobs.push(new Blob(x, y, 16));

    }
  }
  

  blob.show();
  blob.update();

}