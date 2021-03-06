package java.lang

class StringBuffer(private var content: String) extends CharSequence
                                                   with Appendable
                                                   with java.io.Serializable {
  def this() = this("")
  def this(initialCapacity: Int) = this("")
  def this(csq: CharSequence) = this(csq.toString)

  def append(s: String): StringBuffer = {
    content += s
    this
  }

  def append(b: Boolean): StringBuffer = append(b.toString())
  def append(c: Char): StringBuffer = append(c.toString())
  def append(b: Byte): StringBuffer = append(b.toString())
  def append(s: Short): StringBuffer = append(s.toString())
  def append(i: Int): StringBuffer = append(i.toString())
  def append(lng: Long): StringBuffer = append(lng.toString())
  def append(f: Float): StringBuffer = append(f.toString())
  def append(d: Double): StringBuffer = append(d.toString())

  def append(obj: AnyRef): StringBuffer = append(obj.toString())

  def append(csq: CharSequence): StringBuffer = append(csq.toString())
  def append(csq: CharSequence, start: Int, end: Int): StringBuffer =
    append(csq.subSequence(start, end).toString())

  override def toString() = content

  def length() = content.length()

  def charAt(index: Int) = content.charAt(index)
  def codePointAt(index: Int) = content.codePointAt(index)

  def subSequence(start: Int, end: Int): CharSequence = substring(start, end)
  def substring(start: Int): String = content.substring(start)
  def substring(start: Int, end: Int): String = content.substring(start, end)
}
