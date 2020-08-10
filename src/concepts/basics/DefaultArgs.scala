package concepts.basics

/**
 * Default arguments
 */
object DefaultArgs extends App {
  // jpg, 400, 600 are default values if arguments are not provided to function
  def savePicture(format: String = "jpg", width: Int = 400, height: Int = 600) = {
    println("Image Format: " + format)
    println("Image Size: " + height + " x " + width)
  }
  // no args
  savePicture()
  // override default format
  savePicture("png")
  // doesn't work if there are leading default args
  // savePicture(200, 400)

  // to fix, we can specify arg name which can be in any order
  savePicture(height = 200, width = 300, format = "gif")
}
