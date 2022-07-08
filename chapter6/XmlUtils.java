package chapter6;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

// https://stepik.org/lesson/562761/step/11
class XmlUtils {

    public static Map<String, Long> countAllByTagName(List<XmlFile> files, String tagName) {
        return files.stream()
                .collect(groupingBy(XmlFile::getEncoding, filtering(
                                        xmlFile -> xmlFile.getTags().stream()
                                                .anyMatch(tag -> tag.getName().equals(tagName)), flatMapping(
                                                tag -> tag.getTags().stream(), counting()
                                        )
                                )
                        )
                );
    }// write your code here

    public static void main(String[] args) {
        List<XmlFile> xmlFiles = List.of(
                new XmlFile("1", "UTF-8", List.of(new Tag("function"), new Tag("load"))),
                new XmlFile("2", "UTF-8", List.of(new Tag("table"), new Tag("main"))),
                new XmlFile("3", "ASCII", List.of(new Tag("row"), new Tag("column"))),
                new XmlFile("4", "ASCII", List.of(new Tag("sheet"), new Tag("row"))),
                new XmlFile("5", "ASCII", List.of(new Tag("sheet"), new Tag("column"), new Tag("row")))
        );

        System.out.println(XmlUtils.countAllByTagName(xmlFiles, "sheet")); // returns = {"UTF-8"=0, "ASCII"=5}
    }

}

class Tag {
    private final String name;

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class XmlFile {
    private final String id;
    private final String encoding;
    private final List<Tag> tags;

    public XmlFile(String id, String encoding, List<Tag> tags) {
        this.id = id;
        this.encoding = encoding;
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public String getEncoding() {
        return encoding;
    }
}
