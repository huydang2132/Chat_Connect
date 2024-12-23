package com.project.chatconnect.domains.enities;

import com.project.chatconnect.domains.enities.base.AuditingEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Set;

/**
 * The type Chat.
 *
 * @author Huy Dang
 */
@Document(collection = "chats")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Chat extends AuditingEntity {
    @Id
    private String id;

    @Field("users")
    @DBRef
    private Set<User> users;

    private Boolean isGroup = Boolean.FALSE;

    private Messages lastMessage;

    @DBRef
    private Set<MessageGroupMember> members;
}
